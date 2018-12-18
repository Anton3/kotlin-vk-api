package name.alatushkin.vkapi.client

import io.ktor.client.HttpClient
import name.alatushkin.vkapi.json.vkObjectMapper

@Suppress("FunctionName")
fun VkClientFactory(httpClient: HttpClient): VkClientFactory {
    return VkClientFactory(KtorHttpClient(httpClient), vkObjectMapper())
}
