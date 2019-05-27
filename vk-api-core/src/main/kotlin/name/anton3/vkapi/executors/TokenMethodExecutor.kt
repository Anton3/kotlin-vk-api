package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.rate.DynamicRequest
import name.anton3.vkapi.rate.map
import name.anton3.vkapi.tokens.Token
import name.anton3.vkapi.tokens.attach
import name.anton3.vkapi.vktypes.VkResponse

class TokenMethodExecutor(
    private val base: MethodExecutor,
    private val token: Token<*>
) : MethodExecutor {

    override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*>>): VkResponse<*> {
        return base.execute(dynamicRequest.map { it.attach(token) })
    }

    override val transportClient: TransportClient get() = base.transportClient
    override val objectMapper: ObjectMapper get() = base.objectMapper
}
