package name.anton3.vkapi.core

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
            response = callWithNetworkRetries(request)
            if (!isInvalidGatewayStatus(response.status)) return response
        }

        return response
    }

    private suspend fun callWithNetworkRetries(request: TransportRequest): TransportResponse {
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

    private suspend fun callWithLogging(request: TransportRequest): TransportResponse {
        val startTime = Instant.now()

        try {
            val vkResponse = base(request)
            val resultTime = Duration.between(startTime, Instant.now())
            logRequest(request, vkResponse, resultTime)
            return vkResponse
        } catch (e: IOException) {
            val resultTime = Duration.between(startTime, Instant.now())
            logRequest(request, null, resultTime)
            throw e
        }
    }

    private fun isInvalidGatewayStatus(status: Int): Boolean {
        return status == 502 || status == 504  // Bad gateway, gateway timeout
    }

    private fun logRequest(
        request: TransportRequest,
        response: TransportResponse?,
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
              Body: ${request.body}
              Response time: ${resultTime ?: "-"}
              Status: ${response?.status ?: "-"}
              Response: ${response?.data?.toString(Charsets.UTF_8)?.take(10000) ?: "-"}
            """.trimIndent()
        }
    }

    private companion object : Logging
}
