package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.core.map
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.tokens.Token
import name.anton3.vkapi.vktypes.VkResponse

class TokenMethodExecutor(
    private val base: MethodExecutor,
    private val token: Token<*>
) : MethodExecutor {

    override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*, *>>): VkResponse<*> {
        return base.execute(dynamicRequest.map { token.attachTo(it); it })
    }

    override val transportClient: TransportClient get() = base.transportClient
    override val objectMapper: ObjectMapper get() = base.objectMapper
}
