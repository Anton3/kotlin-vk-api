package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.core.map
import name.anton3.executors.instances.DistributingExecutor
import name.anton3.executors.util.batchAwareRequestStorage
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.tokens.Token
import name.anton3.vkapi.transport.TransportClient
import name.anton3.vkapi.vktypes.VkResponse
import java.io.Closeable
import java.time.Duration
import kotlin.coroutines.CoroutineContext

class MultiTokenMethodExecutor(
    private val base: MethodExecutor,
    coroutineContext: CoroutineContext,
    private val rateLimit: Int,
    private val ratePeriod: Duration = Duration.ofSeconds(1L),
    tokens: Iterable<Token<*>> = emptyList()
) : MethodExecutor, Closeable {

    private val distributor: DistributingExecutor<VkMethod<*, *>, VkResponse<*>, Token<*>> =
        DistributingExecutor(
            { dr, token -> base.execute(dr.map { token.attachTo(it); it }) },
            coroutineContext,
            batchAwareRequestStorage()
        )

    init {
        tokens.forEach { addToken(it) }
    }

    val tokens: Set<Token<*>>
        get() = distributor.directions

    fun addToken(token: Token<*>): Boolean {
        return distributor.addDirection(token, rateLimit, ratePeriod)
    }

    fun removeToken(token: Token<*>): Boolean {
        return distributor.removeDirection(token)
    }

    suspend fun removeTokenAndJoin(token: Token<*>): Boolean {
        return distributor.removeDirectionAndJoin(token)
    }

    override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*, *>>): VkResponse<*> {
        return distributor.execute(dynamicRequest)
    }

    override val transportClient: TransportClient get() = base.transportClient
    override val objectMapper: ObjectMapper get() = base.objectMapper

    override fun close() {
        distributor.close()
    }
}
