package name.anton3.vkapi.client

import name.anton3.vkapi.core.RetryingTransportClient
import name.anton3.vkapi.json.core.vkObjectMapper
import org.apache.http.nio.client.HttpAsyncClient

fun apacheClientFactory(httpClient: HttpAsyncClient): VkClientFactory {
    return VkClientFactory(RetryingTransportClient(ApacheTransportClient(httpClient)), vkObjectMapper())
}
