package name.alatushkin.vkapi.client

import io.ktor.client.request.forms.FormBuilder
import io.ktor.client.request.forms.MultiPartFormDataContent
import io.ktor.client.request.forms.append
import io.ktor.client.request.forms.formData
import io.ktor.client.request.request
import io.ktor.client.response.HttpResponse
import io.ktor.client.response.readBytes
import io.ktor.client.utils.EmptyContent
import io.ktor.http.*
import io.ktor.http.HttpMethod
import io.ktor.http.content.ByteArrayContent
import io.ktor.http.content.OutgoingContent
import io.ktor.util.appendAll
import io.ktor.util.toMap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import mu.KotlinLogging
import name.alatushkin.httpclient.*
import java.io.IOException
import java.time.Duration
import java.time.Instant

class KtorHttpClient(
    private val client: io.ktor.client.HttpClient,
    private val retryAttemptsNetworkErrorCount: Int = 3,
    private val retryAttemptsInvalidStatusCount: Int = 3
) : HttpClient {

    companion object {
        private val log = KotlinLogging.logger {}
    }

    private val dispatcher = Dispatchers.Default

    private data class HttpRequestTemplate(
        val method: HttpMethod,
        val uri: URLBuilder,
        val headers: HeadersBuilder,
        val body: OutgoingContent
    )

    private suspend fun callWithStatusCheck(request: HttpRequestTemplate): Response {
        lateinit var response: Response

        repeat(retryAttemptsInvalidStatusCount) {
            response = call(request)
            if (!isInvalidGatewayStatus(HttpStatusCode.fromValue(response.code))) return response
        }

        return response
    }

    private fun isInvalidGatewayStatus(status: HttpStatusCode): Boolean {
        return status == HttpStatusCode.BadGateway || status == HttpStatusCode.GatewayTimeout
    }

    private suspend fun call(request: HttpRequestTemplate): Response {
        lateinit var exception: IOException

        repeat(retryAttemptsNetworkErrorCount) {
            val startTime = Instant.now()!!

            try {
                val response = withContext(dispatcher) {
                    client.request<HttpResponse> {
                        method = request.method
                        url.takeFrom(request.uri)
                        headers.appendAll(request.headers)
                        body = request.body
                    }
                }

                response.requestTime

                val result = withContext(dispatcher) {
                    response.readBytes()
                }

                val endTime = Instant.now()!!
                val resultTime = Duration.between(startTime, endTime)!!

                logRequest(request, response, result, resultTime)
                return toVkResponse(response, result)

            } catch (e: IOException) {

                val endTime = Instant.now()!!
                val resultTime = Duration.between(startTime, endTime)

                logRequest(request, null, null, resultTime)
                log.warn("Network troubles", e)
                exception = e
            }
        }

        throw exception
    }

    private fun logRequest(request: HttpRequestTemplate, response: HttpResponse?, result: ByteArray?, resultTime: Duration?) {
        if (log.isDebugEnabled) {
            log.info(
                """
                URI: ${request.uri}
                Method: ${request.method}
                Request headers: ${request.headers.build().entries().joinToString { "${it.key}=${it.value}" }}
                Response time: ${resultTime ?: "-"}
                Status: ${response?.status ?: "-"}
                Response headers: ${response?.headers?.toMap()?.toString() ?: "-"}
                Response: ${result?.toString(Charsets.UTF_8) ?: "-"}
                """.trimIndent()
            )
        } else if (log.isInfoEnabled) {
            log.info("Request: ${request.uri.buildString()}\t\tTime=$resultTime")
        }
    }

    private fun toVkResponse(httpResponse: HttpResponse, rawContent: ByteArray): Response {
        return Response(httpResponse.status.value, rawContent)
    }

    private fun FormBuilder.appendBodyPart(name: String, data: Any) = when (data) {
        is StringPart -> append(name, name) {
            data.value.toByteArray().let { writeFully(it, 0, it.size) }
        }
        is FilePart -> append(name, data.fileName) {
            writeFully(data.byteArray, 0, data.byteArray.size)
        }
        is BinaryPart -> append(name) {
            writeFully(data.byteArray, 0, data.byteArray.size)
        }
        else -> error("Unknown part type")
    }

    private fun convertBody(body: RequestBody?): OutgoingContent = when (body) {
        is RequestBody.FormUrlEncoded -> EmptyContent
        is RequestBody.MultipartBody -> MultiPartFormDataContent(formData {
            body.map.forEach { (name, data) -> appendBodyPart(name, data) }
        })
        is RequestBody.RawBody -> ByteArrayContent(body.byteArray)
        null -> EmptyContent
        else -> error("Unknown body type")
    }

    override suspend fun invoke(httpRequest: HttpRequest): Response {
        val bodyBase = httpRequest.body

        val body: OutgoingContent = convertBody(bodyBase)

        val baseUrl = URLBuilder().takeFrom(httpRequest.url)

        val url = when (bodyBase) {
            is RequestBody.FormUrlEncoded -> {
                baseUrl.apply {
                    for ((key, value) in bodyBase.map) {
                        parameters.append(key, value.toString())
                    }
                }
            }
            else -> baseUrl
        }

        val headers = HeadersBuilder().apply {
            for ((key, value) in httpRequest.header) {
                append(key, value)
            }
        }

        return callWithStatusCheck(
            HttpRequestTemplate(
                method = HttpMethod.parse(httpRequest.method.toString()),
                uri = url,
                headers = headers,
                body = body
            )
        )
    }
}
