package name.anton3.vkapi.client

import com.fasterxml.jackson.databind.ObjectMapper
import kotlinx.coroutines.Dispatchers
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.executors.BatchMethodExecutor
import name.anton3.vkapi.executors.SimpleMethodExecutor
import name.anton3.vkapi.executors.ThrottledMethodExecutor
import name.anton3.vkapi.tokens.*
import java.time.Duration

class VkClientFactory(httpClient: TransportClient, objectMapper: ObjectMapper) {

    private val baseExecutor: MethodExecutor = SimpleMethodExecutor(httpClient, objectMapper)

    fun user(
        token: UserToken,
        flushDelayMillis: Long = 500L,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): VkClient<UserMethod> {
        val throttled = ThrottledMethodExecutor(baseExecutor, 3)
        val batch = BatchMethodExecutor(throttled, Dispatchers.Default, Duration.ofMillis(flushDelayMillis), token)
        return executorWrapper(batch).attach(token)
    }

    fun group(
        token: GroupToken,
        flushDelayMillis: Long = 60L,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): VkClient<GroupMethod> {
        val throttled = ThrottledMethodExecutor(baseExecutor, 20)
        val batch = BatchMethodExecutor(throttled, Dispatchers.Default, Duration.ofMillis(flushDelayMillis), token)
        return executorWrapper(batch).attach(token)
    }

    fun ads(
        token: UserToken,
        serviceType: AdServiceType = AdServiceType.NORMAL,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): VkClient<UserMethod> {
        val throttled1 = ThrottledMethodExecutor(baseExecutor, 2)
        val throttled2 = ThrottledMethodExecutor(throttled1, serviceType.requestsPerHour, Duration.ofHours(1))
        return executorWrapper(throttled2).attach(token)
    }

    fun secure(
        token: ServiceToken,
        appPopularity: SecureAppPopularity = SecureAppPopularity.SMALL,
        executorWrapper: (MethodExecutor) -> MethodExecutor = { it }
    ): VkClient<ServiceMethod> {
        val throttled = ThrottledMethodExecutor(baseExecutor, appPopularity.requestsPerSecond)
        return executorWrapper(throttled).attach(token)
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
