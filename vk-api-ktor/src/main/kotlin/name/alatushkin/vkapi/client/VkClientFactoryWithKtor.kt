package name.alatushkin.vkapi.client

import io.ktor.client.HttpClient
import name.alatushkin.vkapi.json.vkObjectMapper

fun ktorClientFactory(httpClient: HttpClient): VkClientFactory {
    return VkClientFactory(KtorTransportClient(httpClient), vkObjectMapper())
}
