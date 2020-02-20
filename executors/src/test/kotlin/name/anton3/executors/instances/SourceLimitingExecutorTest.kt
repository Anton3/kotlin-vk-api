package name.anton3.executors.instances

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.time.delay
import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.map
import name.anton3.executors.util.FifoRequestStorage
import org.junit.jupiter.api.Test
import java.io.IOException
import java.time.Duration
import kotlin.random.Random

class SourceLimitingExecutorTest {
    @Test
    fun testThrottledExecutor(): Unit = runBlocking(context = Dispatchers.Default) {
        val baseExecutor = DynamicExecutor<String, Unit> { request ->
            println(request.get())
        }

        val throttler = ThrottledExecutor(
            base = baseExecutor,
            coroutineContext = Dispatchers.Default,
            rateLimit = 3,
            ratePeriod = Duration.ofSeconds(1),
            requestStorage = FifoRequestStorage()
        )

        val batcher = BatchExecutor(
            base = DynamicExecutor<List<String>, List<Unit>> { request ->
                throttler.execute(request.map { "batch: " + it.joinToString() })
                List(request.get().size) { Unit }
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

//        throttler.close()
        batcher.close()
        Unit
    }

    @Test
    fun testThrowing(): Unit = runBlocking(context = Dispatchers.Default) {
        val baseExecutor = DynamicExecutor<String, Unit> { request ->
            if (Random.nextDouble() < 0.5) throw IOException("Failed to print \"${request.get()}\"")
        }

        val throttler = ThrottledExecutor(
            base = baseExecutor,
            coroutineContext = coroutineContext,
            rateLimit = 2000,
            ratePeriod = Duration.ofSeconds(1),
            requestStorage = FifoRequestStorage()
        )

        val s = Semaphore(permits = 10000, acquiredPermits = 10000)

        coroutineScope {
            repeat(10000) { i ->
                launch {
                    s.acquire()
                    try {
                        throttler.execute(i.toString())
                    } catch (e: IOException) {
                        Unit
                    }
                    s.release()
                }
            }

            repeat(10000) { s.release() }
        }

        throttler.close()
        Unit
    }

    @Test
    fun testLimitedHistory(): Unit = runBlocking(context = Dispatchers.Default) {
        val baseExecutor = DynamicExecutor<String, Unit> { request ->
            println(request.get())
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
        Unit
    }
}
