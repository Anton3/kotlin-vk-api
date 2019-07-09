package name.anton3.vkapi.client

import io.ktor.client.HttpClient
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.forms.MultiPartFormDataContent
import io.ktor.client.request.forms.append
import io.ktor.client.request.forms.formData
import io.ktor.client.request.request
import io.ktor.client.response.HttpResponse
import io.ktor.client.response.readBytes
import io.ktor.http.*
import io.ktor.http.content.OutgoingContent
import io.ktor.http.content.TextContent
import kotlinx.io.charsets.Charsets
import mu.KotlinLogging
import name.anton3.vkapi.core.RequestContent
import name.anton3.vkapi.core.TransportClient
import java.io.IOException
import java.time.Duration
import java.time.Instant

class KtorTransportClient(
    private val client: HttpClient,
    private val retryAttemptsNetworkErrorCount: Int = 3,
    private val retryAttemptsInvalidStatusCount: Int = 3
) : TransportClient {

    companion object {
        private val log = KotlinLogging.logger {}
    }

    private suspend fun callWithStatusCheck(request: HttpRequestBuilder, rawRequest: TransportClient.Request): TransportClient.Response {
        lateinit var response: TransportClient.Response

        repeat(retryAttemptsInvalidStatusCount) {
            response = call(request, rawRequest)
            if (!isInvalidGatewayStatus(HttpStatusCode.fromValue(response.status))) return response
        }

        return response
    }

    private fun isInvalidGatewayStatus(status: HttpStatusCode): Boolean {
        return status == HttpStatusCode.BadGateway || status == HttpStatusCode.GatewayTimeout
    }

    private suspend fun call(request: HttpRequestBuilder, rawRequest: TransportClient.Request): TransportClient.Response {
        lateinit var exception: IOException

        repeat(retryAttemptsNetworkErrorCount) {
            val startTime = Instant.now()!!

            try {
                val response = client.request<HttpResponse>(HttpRequestBuilder().takeFrom(request))

                response.requestTime

                val result = response.readBytes()

                val endTime = Instant.now()!!
                val resultTime = Duration.between(startTime, endTime)!!
                val vkResponse = toVkResponse(response, result)

                logRequest(rawRequest, vkResponse, result, resultTime)
                return toVkResponse(response, result)

            } catch (e: IOException) {
                val endTime = Instant.now()!!
                val resultTime = Duration.between(startTime, endTime)

                logRequest(rawRequest, null, null, resultTime)
                log.warn("Network troubles")
                exception = e
            }
        }

        throw exception
    }

    private fun logRequest(
        request: TransportClient.Request,
        response: TransportClient.Response?,
        result: ByteArray?,
        resultTime: Duration?
    ) {
        if (!log.isInfoEnabled) return

        if (log.isDebugEnabled) {
            log.debug {
                val contentString = when (val content = request.content) {
                    is RequestContent.Empty -> "$content"
                    is RequestContent.Text -> "$content"
                    is RequestContent.Form -> "$content"
                    is RequestContent.File -> "File(key=${content.key}, fileName=${content.fileName})"
                }

                """
                ${request.method} ${request.url}
                Request: $contentString
                Response time: ${resultTime ?: "-"}
                Status: ${response?.status ?: "-"}
                Response: ${result?.toString(Charsets.UTF_8)?.take(10000) ?: "-"}
                """.trimIndent()
            }
        } else {
            log.info {
                "Request: ${request.method} ${request.url}"
            }
        }
    }

    private fun toVkResponse(httpResponse: HttpResponse, rawContent: ByteArray): TransportClient.Response {
        return TransportClient.Response(httpResponse.status.value, rawContent)
    }

    private fun convertBody(body: RequestContent): OutgoingContent = when (body) {
        is RequestContent.Empty -> TextContent("", ContentType.parse(body.contentType).withCharset(Charsets.UTF_8))
        is RequestContent.Text -> TextContent(body.data, ContentType.parse(body.contentType).withCharset(Charsets.UTF_8))
        is RequestContent.Form -> MultiPartFormDataContent(formData {
            for ((key, value) in body.data) {
                append(key, value)
            }
        })
        is RequestContent.File -> MultiPartFormDataContent(formData {
            append(body.key, body.fileName) {
                writeFully(body.data, 0, body.data.size)
            }
        })
    }

    override suspend fun invoke(request: TransportClient.Request): TransportClient.Response {
        val httpRequest = HttpRequestBuilder().apply {
            method = HttpMethod.parse(request.method.toString())
            url.takeFrom(request.url)
            body = convertBody(request.content)
        }

        return callWithStatusCheck(httpRequest, request)
    }
}
