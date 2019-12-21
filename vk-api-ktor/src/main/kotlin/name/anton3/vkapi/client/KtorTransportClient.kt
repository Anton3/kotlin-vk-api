package name.anton3.vkapi.client

import io.ktor.client.HttpClient
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.forms.MultiPartFormDataContent
import io.ktor.client.request.forms.append
import io.ktor.client.request.forms.formData
import io.ktor.client.statement.HttpStatement
import io.ktor.client.statement.readBytes
import io.ktor.http.*
import io.ktor.http.content.OutgoingContent
import io.ktor.http.content.TextContent
import io.ktor.utils.io.core.writeFully
import name.anton3.vkapi.core.RequestContent
import name.anton3.vkapi.core.TransportClient
import org.apache.logging.log4j.kotlin.Logging
import java.io.IOException
import java.time.Duration
import java.time.Instant

class KtorTransportClient(
    private val client: HttpClient,
    private val retryAttemptsNetworkErrorCount: Int = 3,
    private val retryAttemptsInvalidStatusCount: Int = 3
) : TransportClient {

    override suspend fun invoke(request: TransportClient.Request): TransportClient.Response {
        return callWithStatusCheck(request)
    }

    private suspend fun callWithStatusCheck(request: TransportClient.Request): TransportClient.Response {
        lateinit var response: TransportClient.Response

        repeat(retryAttemptsInvalidStatusCount) {
            response = callWithNetworkRetries(request)
            if (!isInvalidGatewayStatus(HttpStatusCode.fromValue(response.status))) return response
        }

        return response
    }

    private suspend fun callWithNetworkRetries(request: TransportClient.Request): TransportClient.Response {
        lateinit var exception: IOException

        repeat(retryAttemptsNetworkErrorCount) {
            try {
                return callWithLogging(request)
            } catch (e: IOException) {
                exception = e
            }
        }

        throw exception
    }

    private suspend fun callWithLogging(request: TransportClient.Request): TransportClient.Response {
        val startTime = Instant.now()

        try {
            val vkResponse = call(request)
            val resultTime = Duration.between(startTime, Instant.now())
            logRequest(request, vkResponse, resultTime)
            return vkResponse
        } catch (e: IOException) {
            val resultTime = Duration.between(startTime, Instant.now())
            logRequest(request, null, resultTime)
            throw e
        }
    }

    private suspend fun call(request: TransportClient.Request): TransportClient.Response {
        val httpRequest = HttpRequestBuilder().apply {
            method = HttpMethod.parse(request.method.toString())
            url.takeFrom(request.url)
            body = convertBody(request.content)
        }

        return HttpStatement(httpRequest, client).execute {
            TransportClient.Response(it.status.value, it.readBytes())
        }
    }

    private fun isInvalidGatewayStatus(status: HttpStatusCode): Boolean {
        return status == HttpStatusCode.BadGateway || status == HttpStatusCode.GatewayTimeout
    }

    private fun logRequest(
        request: TransportClient.Request,
        response: TransportClient.Response?,
        resultTime: Duration?
    ) {
        if (response == null) {
            logger.warn { "Network troubles: ${request.method} ${request.url}" }
        } else {
            logger.info { "Request: ${request.method} ${request.url}" }
        }

        logger.debug {
            """
            Request details
              Body: ${request.content}
              Response time: ${resultTime ?: "-"}
              Status: ${response?.status ?: "-"}
              Response: ${response?.data?.toString(Charsets.UTF_8)?.take(10000) ?: "-"}
            """.trimIndent()
        }
    }

    private fun convertBody(body: RequestContent): OutgoingContent = when (body) {
        is RequestContent.Empty -> {
            TextContent("", ContentType.parse(body.contentType).withCharset(Charsets.UTF_8))
        }
        is RequestContent.Text -> {
            TextContent(body.data, ContentType.parse(body.contentType).withCharset(Charsets.UTF_8))
        }
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

    private companion object : Logging
}
