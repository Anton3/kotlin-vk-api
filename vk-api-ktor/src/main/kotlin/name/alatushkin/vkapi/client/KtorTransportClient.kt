package name.alatushkin.vkapi.client

import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.forms.MultiPartFormDataContent
import io.ktor.client.request.forms.append
import io.ktor.client.request.forms.formData
import io.ktor.client.request.request
import io.ktor.client.response.HttpResponse
import io.ktor.client.response.readBytes
import io.ktor.http.ContentType
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.http.content.ByteArrayContent
import io.ktor.http.content.OutgoingContent
import io.ktor.http.content.TextContent
import io.ktor.http.takeFrom
import io.ktor.util.toMap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import mu.KotlinLogging
import name.alatushkin.vkapi.core.RequestContent
import name.alatushkin.vkapi.core.TransportClient
import java.io.IOException
import java.time.Duration
import java.time.Instant

class KtorTransportClient(
    private val client: io.ktor.client.HttpClient,
    private val retryAttemptsNetworkErrorCount: Int = 3,
    private val retryAttemptsInvalidStatusCount: Int = 3
) : TransportClient {

    companion object {
        private val log = KotlinLogging.logger {}
    }

    private val dispatcher = Dispatchers.Default

    private suspend fun callWithStatusCheck(request: HttpRequestBuilder): TransportClient.Response {
        lateinit var response: TransportClient.Response

        repeat(retryAttemptsInvalidStatusCount) {
            response = call(request)
            if (!isInvalidGatewayStatus(HttpStatusCode.fromValue(response.status))) return response
        }

        return response
    }

    private fun isInvalidGatewayStatus(status: HttpStatusCode): Boolean {
        return status == HttpStatusCode.BadGateway || status == HttpStatusCode.GatewayTimeout
    }

    private suspend fun call(request: HttpRequestBuilder): TransportClient.Response {
        lateinit var exception: IOException

        repeat(retryAttemptsNetworkErrorCount) {
            val startTime = Instant.now()!!

            try {
                val response = withContext(dispatcher) {
                    client.request<HttpResponse>(request)
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

    private fun logRequest(request: HttpRequestBuilder, response: HttpResponse?, result: ByteArray?, resultTime: Duration?) {
        if (log.isDebugEnabled) {
            log.info(
                """
                URI: ${request.url.buildString()}
                Method: ${request.method}
                Request headers: ${request.headers.build().entries().joinToString { "${it.key}=${it.value}" }}
                Response time: ${resultTime ?: "-"}
                Status: ${response?.status ?: "-"}
                Response headers: ${response?.headers?.toMap()?.toString() ?: "-"}
                Response: ${result?.toString(Charsets.UTF_8) ?: "-"}
                """.trimIndent()
            )
        } else if (log.isInfoEnabled) {
            log.info("Request: ${request.url.buildString()}\t\tTime=$resultTime")
        }
    }

    private fun toVkResponse(httpResponse: HttpResponse, rawContent: ByteArray): TransportClient.Response {
        return TransportClient.Response(httpResponse.status.value, rawContent)
    }

    private fun convertBody(body: RequestContent): OutgoingContent = when (body) {
        is RequestContent.Empty -> TextContent("", ContentType.parse(body.contentType))
        is RequestContent.File -> MultiPartFormDataContent(formData {
            append(body.key, body.fileName) {
                writeFully(body.data, 0, body.data.size)
            }
        })
        is RequestContent.Text -> ByteArrayContent(body.data.toByteArray(), ContentType.parse(body.contentType))
    }

    override suspend fun invoke(request: TransportClient.Request): TransportClient.Response {
        return callWithStatusCheck(
            HttpRequestBuilder().apply {
                method = HttpMethod.parse(request.method.toString())
                url.takeFrom(request.url)
                body = convertBody(request.content)
            }
        )
    }
}
