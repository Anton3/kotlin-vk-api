package name.anton3.vkapi.client

import com.fasterxml.jackson.databind.ObjectMapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.executors.BatchMethodExecutor
import name.anton3.vkapi.executors.SimpleMethodExecutor
import name.anton3.vkapi.executors.ThrottledMethodExecutor
import name.anton3.vkapi.executors.TokenMethodExecutor
import name.anton3.vkapi.rate.AsyncCloseable
import name.anton3.vkapi.tokens.GroupToken
import name.anton3.vkapi.tokens.ServiceToken
import name.anton3.vkapi.tokens.UserToken
import java.time.Duration
import kotlin.coroutines.CoroutineContext

class VkClientFactory(
    transportClient: TransportClient,
    objectMapper: ObjectMapper,
    parentContext: CoroutineContext = Dispatchers.Default
) {
    private val job = Job(parentContext[Job])
    private val context = parentContext + job
    private val baseExecutor: MethodExecutor = SimpleMethodExecutor(transportClient, objectMapper)
    private val closeableExecutors: MutableList<AsyncCloseable> = mutableListOf()

    @Synchronized
    fun user(
        token: UserToken,
        flushDelayMillis: Long = 500L,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): UserClient {
        val withToken = TokenMethodExecutor(baseExecutor, token)
        val throttled = ThrottledMethodExecutor(withToken, context, 3)
        val batch = BatchMethodExecutor(throttled, context, Duration.ofMillis(flushDelayMillis))
        closeableExecutors.add(throttled)
        closeableExecutors.add(batch)
        return UserClient(executorWrapper(batch))
    }

    @Synchronized
    fun group(
        token: GroupToken,
        flushDelayMillis: Long = 60L,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): GroupClient {
        val withToken = TokenMethodExecutor(baseExecutor, token)
        val throttled = ThrottledMethodExecutor(withToken, context, 20)
        val batch = BatchMethodExecutor(throttled, context, Duration.ofMillis(flushDelayMillis))
        closeableExecutors.add(throttled)
        closeableExecutors.add(batch)
        return GroupClient(executorWrapper(batch))
    }

    @Synchronized
    fun ads(
        token: UserToken,
        serviceType: AdServiceType = AdServiceType.NORMAL,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): UserClient {
        val withToken = TokenMethodExecutor(baseExecutor, token)
        val throttled1 = ThrottledMethodExecutor(withToken, context, 2)
        val throttled2 = ThrottledMethodExecutor(throttled1, context, serviceType.requestsPerHour, Duration.ofHours(1))
        closeableExecutors.add(throttled1)
        closeableExecutors.add(throttled2)
        return UserClient(executorWrapper(throttled2))
    }

    @Synchronized
    fun secure(
        token: ServiceToken,
        appPopularity: SecureAppPopularity = SecureAppPopularity.SMALL,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): ServiceClient {
        val withToken = TokenMethodExecutor(baseExecutor, token)
        val throttled = ThrottledMethodExecutor(withToken, context, appPopularity.requestsPerSecond)
        closeableExecutors.add(throttled)
        return ServiceClient(executorWrapper(throttled))
    }

    @Synchronized
    suspend fun closeAndJoin() {
        for (executor in closeableExecutors.asReversed()) {
            executor.close()
            executor.join()
        }
        job.join()
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
