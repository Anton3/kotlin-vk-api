package name.anton3.vkapi.client

import com.fasterxml.jackson.databind.ObjectMapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.executors.BatchMethodExecutor
import name.anton3.vkapi.executors.JsonApiMethodExecutor
import name.anton3.vkapi.executors.ThrottledMethodExecutor
import name.anton3.vkapi.executors.TokenMethodExecutor
import name.anton3.vkapi.method.GroupMethod
import name.anton3.vkapi.method.ServiceMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.tokens.GroupToken
import name.anton3.vkapi.tokens.ServiceToken
import name.anton3.vkapi.tokens.UserToken
import java.io.Closeable
import java.time.Duration
import kotlin.coroutines.CoroutineContext

class VkClientFactory(
    transportClient: TransportClient,
    objectMapper: ObjectMapper,
    parentContext: CoroutineContext = Dispatchers.Default
) {
    private val job = Job(parentContext[Job])
    private val context = parentContext + job
    private val baseExecutor: MethodExecutor = JsonApiMethodExecutor(transportClient, objectMapper)
    private val closeableExecutors: MutableList<Closeable> = mutableListOf()
    private val closeableExecutorsMutex: Mutex = Mutex()

    suspend fun user(
        token: UserToken,
        flushDelayMillis: Long = 500L,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): VkClient<UserMethod> {
        val withToken = TokenMethodExecutor(baseExecutor, token)
        val throttled = ThrottledMethodExecutor(withToken, context, 3)
        val batch = BatchMethodExecutor(throttled, context, Duration.ofMillis(flushDelayMillis))
        closeableExecutorsMutex.withLock { closeableExecutors.addAll(listOf(throttled, batch)) }
        return VkClient<UserMethod>(executorWrapper(batch))
    }

    suspend fun group(
        token: GroupToken,
        flushDelayMillis: Long = 60L,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): VkClient<GroupMethod> {
        val withToken = TokenMethodExecutor(baseExecutor, token)
        val throttled = ThrottledMethodExecutor(withToken, context, 20)
        val batch = BatchMethodExecutor(throttled, context, Duration.ofMillis(flushDelayMillis))
        closeableExecutorsMutex.withLock { closeableExecutors.addAll(listOf(throttled, batch)) }
        return VkClient<GroupMethod>(executorWrapper(batch))
    }

    suspend fun ads(
        token: UserToken,
        serviceType: AdServiceType = AdServiceType.NORMAL,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): VkClient<UserMethod> {
        val withToken = TokenMethodExecutor(baseExecutor, token)
        val throttled1 = ThrottledMethodExecutor(withToken, context, 2)
        val throttled2 = ThrottledMethodExecutor(throttled1, context, serviceType.requestsPerHour, Duration.ofHours(1))
        closeableExecutorsMutex.withLock { closeableExecutors.addAll(listOf(throttled1, throttled2)) }
        return VkClient<UserMethod>(executorWrapper(throttled2))
    }

    suspend fun secure(
        token: ServiceToken,
        appPopularity: SecureAppPopularity = SecureAppPopularity.SMALL,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): VkClient<ServiceMethod> {
        val withToken = TokenMethodExecutor(baseExecutor, token)
        val throttled = ThrottledMethodExecutor(withToken, context, appPopularity.requestsPerSecond)
        closeableExecutorsMutex.withLock { closeableExecutors.add(throttled) }
        return VkClient<ServiceMethod>(executorWrapper(throttled))
    }

    suspend fun closeAndJoin() {
        val closeableStuff = closeableExecutorsMutex.withLock { closeableExecutors.toList() }
        withContext(Dispatchers.IO) {
            closeableStuff.reversed().forEach { it.close() }
        }
        job.cancelAndJoin()
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
