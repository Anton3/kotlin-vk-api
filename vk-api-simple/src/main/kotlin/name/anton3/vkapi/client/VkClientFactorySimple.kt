package name.anton3.vkapi.client

import name.anton3.vkapi.core.RetryingTransportClient
import name.anton3.vkapi.json.core.vkObjectMapper
import org.apache.http.client.config.RequestConfig
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder
import org.apache.http.nio.client.HttpAsyncClient

fun apacheClientFactory(httpClient: HttpAsyncClient = simpleAsyncHttpClient()): VkClientFactory {
    return VkClientFactory(RetryingTransportClient(ApacheTransportClient(httpClient)), vkObjectMapper())
}

private fun simpleAsyncHttpClient(): HttpAsyncClient {
    val requestConfig = RequestConfig.custom()
        .setConnectTimeout(10000)
        .setSocketTimeout(10000)
        .setConnectionRequestTimeout(10000)
        .build()
    return HttpAsyncClientBuilder.create()
        .setMaxConnTotal(1000)
        .setMaxConnPerRoute(1000)
        .setDefaultRequestConfig(requestConfig)
        .build()
}
