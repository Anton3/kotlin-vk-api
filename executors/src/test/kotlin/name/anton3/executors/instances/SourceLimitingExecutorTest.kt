package name.anton3.executors.instances

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.time.delay
import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.core.map
import name.anton3.executors.util.FifoRequestStorage
import org.junit.jupiter.api.Test
import java.time.Duration

class SourceLimitingExecutorTest {
    @Test
    fun testThrottledExecutor(): Unit = runBlocking<Unit>(context = Dispatchers.Default) {
        val baseExecutor = object : DynamicExecutor<String, Unit> {
            override suspend fun execute(dynamicRequest: DynamicRequest<String>) {
                println(dynamicRequest.get())
            }
        }

        val throttler = ThrottledExecutor(
            base = baseExecutor,
            coroutineContext = Dispatchers.Default,
            rateLimit = 3,
            ratePeriod = Duration.ofSeconds(1),
            requestStorage = FifoRequestStorage()
        )

        val batcher = BatchExecutor(
            base = object : DynamicExecutor<List<String>, List<Unit>> {
                override suspend fun execute(dynamicRequest: DynamicRequest<List<String>>): List<Unit> {
                    throttler.execute(dynamicRequest.map { "batch: " + it.joinToString() })
                    return List(dynamicRequest.get().size) { Unit }
                }
            },
            coroutineContext = Dispatchers.Default,
            batchSize = 3,
            flushDelay = Duration.ofSeconds(1),
            requestStorage = FifoRequestStorage()
        )

        coroutineScope {
            repeat(17) { i ->
                launch {
                    batcher.execute(i.toString())
                }
            }
        }
    }

    @Test
    fun testLimitedHistory(): Unit = runBlocking<Unit>(context = Dispatchers.Default) {
        val baseExecutor = object : DynamicExecutor<String, Unit> {
            override suspend fun execute(dynamicRequest: DynamicRequest<String>) {
                println(dynamicRequest.get())
            }
        }

        val sourceLimiter = SourceLimitingExecutor(
            base = baseExecutor,
            fullResetDuration = Duration.ofMillis(30),
            timePerRequest = Duration.ofMillis(30),
            sourcesCacheSize = 100
        )

        coroutineScope {
            repeat(10) { i ->
                val keySettingExecutor = KeySettingExecutor(sourceLimiter, RequestSource, i)

                launch {
                    for (j in 1..10) {
                        delay(Duration.ofMillis(30))

                        try {
                            keySettingExecutor.execute("$i $j")
                        } catch (e: RateLimitExceededException) {
                            e.printStackTrace()
                        }
                    }
                }
            }
        }
    }
}
