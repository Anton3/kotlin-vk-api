package name.anton3.executors.instances

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.time.delay
import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest
import org.junit.Test
import java.time.Duration

class SourceLimitingExecutorTest {
    @Test
    fun testLimitedHistory() = runBlocking<Unit>(context = Dispatchers.Default) {
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
                        delay(Duration.ofMillis(20))

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
