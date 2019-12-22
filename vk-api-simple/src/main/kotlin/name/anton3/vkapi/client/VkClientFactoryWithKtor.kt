package name.anton3.vkapi.client

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.engine.cio.endpoint
import name.anton3.vkapi.json.core.vkObjectMapper

fun ktorClientFactory(httpClient: HttpClient = simpleHttpClient()): VkClientFactory {
    return VkClientFactory(KtorTransportClient(httpClient), vkObjectMapper())
}

private fun simpleHttpClient(): HttpClient {
    @Suppress("EXPERIMENTAL_API_USAGE")
    return HttpClient(CIO) {
        expectSuccess = false
        engine {
            maxConnectionsCount = 1000

            endpoint {
                maxConnectionsPerRoute = 1000
                pipelineMaxSize = 20
                keepAliveTime = 10_000
                connectTimeout = 10_000
                requestTimeout = 20_000
                connectRetryAttempts = 3
            }
        }
    }
}
