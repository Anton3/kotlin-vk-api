package name.anton3.vkapi.transport

import org.apache.logging.log4j.kotlin.Logging
import java.io.IOException
import java.time.Duration
import java.time.Instant

class RetryingTransportClient(
    private val base: TransportClient,
    private val retryAttemptsNetworkErrorCount: Int = 3,
    private val retryAttemptsInvalidStatusCount: Int = 3
) : TransportClient {

    override suspend fun invoke(request: TransportRequest): TransportResponse {
        return callWithStatusCheck(request)
    }

    private suspend fun callWithStatusCheck(request: TransportRequest): TransportResponse {
        lateinit var response: TransportResponse

        repeat(retryAttemptsInvalidStatusCount) {
            response = callWithLogging(request)
            if (!isInvalidGatewayStatus(response.status)) return response
        }

        return response
    }

    private suspend fun callWithLogging(request: TransportRequest): TransportResponse {
        val startTime = Instant.now()

        try {
            val vkResponse = callWithNetworkRetries(request)
            val resultTime = Duration.between(startTime, Instant.now())
            logRequest(request, vkResponse, resultTime)
            return vkResponse
        } catch (e: IOException) {
            val resultTime = Duration.between(startTime, Instant.now())
            logRequest(request, null, resultTime)
            throw e
        }
    }

    private suspend fun callWithNetworkRetries(request: TransportRequest): TransportResponse {
        lateinit var exception: IOException

        repeat(retryAttemptsNetworkErrorCount) {
            try {
                return base(request)
            } catch (e: IOException) {
                exception = e
            }
        }

        throw exception
    }

    private fun isInvalidGatewayStatus(status: Int): Boolean {
        return status == 502 || status == 504  // Bad gateway, gateway timeout
    }

    private fun logRequest(
        request: TransportRequest,
        response: TransportResponse?,
        resultTime: Duration
    ) {
        if (response == null) {
            logger.warn { "Network troubles: ${request.method} ${request.url}" }
        } else {
            logger.info { "Request: ${request.method} ${request.url}" }
        }

        logger.debug {
            val requestPart = """
            Request details
              Headers: ${formatHeaders(request.headers)}
              Body: ${request.body}
            """.trimIndent()

            if (response == null) {
                requestPart
            } else {
                val contentType = findHeader(response.headers, "Content-Type")
                    ?.substringBefore(';')?.trim()

                val responseString = if (
                    contentType?.substringBefore('/') == "text" ||
                    contentType == "application/json"
                ) {
                    response.decodeToString().take(10000)
                } else {
                    "<binary data>"
                }

                val responsePart = """
                Response details:
                  Latency: $resultTime
                  Status: ${response.status}
                  Headers: ${formatHeaders(response.headers)}
                  Body: $responseString
                """.trimIndent()

                "$requestPart\n$responsePart"
            }
        }
    }

    private companion object : Logging
}

private fun formatHeaders(headers: Map<String, String>): String {
    return headers.entries.joinToString { "${it.key}: \"${quote(it.value)}\"" }
}

internal fun findHeader(headers: Map<String, String>, key: String): String? {
    return headers.entries.find { it.key.equals(key, ignoreCase = true) }?.value
}
