package name.alatushkin.vkapi.client

import name.alatushkin.httpclient.HttpClient
import name.alatushkin.vkapi.json.vkObjectMapper

@Suppress("FunctionName")
fun VkClientFactory(httpClient: HttpClient): VkClientFactory {
    return VkClientFactory(httpClient, vkObjectMapper())
}
