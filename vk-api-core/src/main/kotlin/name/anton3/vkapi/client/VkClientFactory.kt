package name.anton3.vkapi.client

import com.fasterxml.jackson.databind.ObjectMapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ClosedSendChannelException
import kotlinx.coroutines.channels.toList
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.executors.*
import name.anton3.vkapi.tokens.GroupToken
import name.anton3.vkapi.tokens.ServiceToken
import name.anton3.vkapi.tokens.UserToken
import name.anton3.vkapi.transport.TransportClient
import java.io.Closeable
import java.time.Duration
import java.util.concurrent.ConcurrentHashMap
import kotlin.coroutines.CoroutineContext

class VkClientFactory(
    transportClient: TransportClient,
    objectMapper: ObjectMapper,
    parentContext: CoroutineContext = Dispatchers.Default
) {
    private val job = Job(parentContext[Job])
    private val context = parentContext + job
    private val baseExecutor: MethodExecutor = JsonApiMethodExecutor(transportClient, objectMapper)
    private val closeableExecutors: Channel<List<Closeable>> = Channel(Channel.UNLIMITED)
    private val multiTokens: MutableMap<GroupClient, MultiTokenMethodExecutor> = ConcurrentHashMap()

    val transportClient: TransportClient get() = baseExecutor.transportClient
    val objectMapper: ObjectMapper get() = baseExecutor.objectMapper

    fun user(
        token: UserToken,
        flushDelayMillis: Long = 60L,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): UserClient {
        val withToken = TokenMethodExecutor(baseExecutor, token)
        val throttled = ThrottledMethodExecutor(withToken, context, 3)
        val batch = BatchMethodExecutor(throttled, context, Duration.ofMillis(flushDelayMillis))
        addCloseableExecutors(throttled, batch)
        return UserClient(executorWrapper(batch))
    }

    fun group(
        tokens: List<GroupToken>,
        flushDelayMillis: Long = 60L,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): GroupClient {
        val multiToken = MultiTokenMethodExecutor(baseExecutor, context, rateLimit = 20, tokens = tokens)
        val batch = BatchMethodExecutor(multiToken, context, Duration.ofMillis(flushDelayMillis))
        val client = GroupClient(executorWrapper(batch))
        multiTokens[client] = multiToken
        addCloseableExecutors(multiToken, batch)
        return client
    }

    fun group(
        token: GroupToken,
        flushDelayMillis: Long = 60L,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): GroupClient = group(listOf(token), flushDelayMillis, executorWrapper)

    fun ads(
        token: UserToken,
        serviceType: AdServiceType = AdServiceType.NORMAL,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): UserClient {
        val withToken = TokenMethodExecutor(baseExecutor, token)
        val throttled1 = ThrottledMethodExecutor(withToken, context, 2)
        val throttled2 = ThrottledMethodExecutor(throttled1, context, serviceType.requestsPerHour, Duration.ofHours(1))
        addCloseableExecutors(throttled1, throttled2)
        return UserClient(executorWrapper(throttled2))
    }

    fun secure(
        token: ServiceToken,
        appPopularity: SecureAppPopularity = SecureAppPopularity.SMALL,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): ServiceClient {
        val withToken = TokenMethodExecutor(baseExecutor, token)
        val throttled = ThrottledMethodExecutor(withToken, context, appPopularity.requestsPerSecond)
        addCloseableExecutors(throttled)
        return ServiceClient(executorWrapper(throttled))
    }

    fun addToken(client: GroupClient, token: GroupToken): Boolean =
        multiTokens[client]?.addToken(token) == true

    fun removeToken(client: GroupClient, token: GroupToken): Boolean =
        multiTokens[client]?.removeToken(token) == true

    suspend fun removeTokenAndJoin(client: GroupClient, token: GroupToken): Boolean =
        multiTokens[client]?.removeTokenAndJoin(token) == true

    suspend fun closeAndJoin() {
        closeableExecutors.close()
        closeableExecutors.toList().flatten().asReversed().forEach { it.close() }
        job.cancelAndJoin()
    }

    private fun addCloseableExecutors(vararg executors: Closeable) {
        try {
            check(closeableExecutors.offer(executors.asList()))
        } catch (e: ClosedSendChannelException) {
            executors.asList().asReversed().forEach { it.close() }
            throw e
        }
    }
}

enum class AdServiceType(val requestsPerHour: Int) {
    NORMAL(5_000),
    AGENCY(10_000)
}

enum class SecureAppPopularity(val minUserCount: Int, val requestsPerSecond: Int) {
    SMALL(0, 5),
    MEDIUM(10_000, 8),
    LARGE(100_000, 20),
    HUGE(1_000_000, 35)
}
