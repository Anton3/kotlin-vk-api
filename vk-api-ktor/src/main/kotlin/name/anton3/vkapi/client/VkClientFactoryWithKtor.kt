package name.anton3.vkapi.client

import io.ktor.client.HttpClient
import name.anton3.vkapi.json.vkObjectMapper

fun ktorClientFactory(httpClient: HttpClient): VkClientFactory {
    return VkClientFactory(KtorTransportClient(httpClient), vkObjectMapper())
}
