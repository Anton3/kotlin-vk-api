package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlinx.coroutines.*
import kotlinx.coroutines.time.delay
import name.anton3.executors.core.DynamicRequest
import name.anton3.vkapi.client.GroupClient
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.json.core.serializeMethod
import name.anton3.vkapi.json.core.vkCoreObjectMapper
import name.anton3.vkapi.method.GroupMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.tokens.GroupToken
import name.anton3.vkapi.transport.TransportClient
import name.anton3.vkapi.transport.TransportRequest
import name.anton3.vkapi.transport.TransportResponse
import name.anton3.vkapi.vktypes.VkApiException
import name.anton3.vkapi.vktypes.VkError
import name.anton3.vkapi.vktypes.VkResponse
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.time.Duration
import java.time.Instant
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicInteger
import kotlin.random.Random

class MultiTokenMethodExecutorTest {
    private val base: MethodExecutor

    init {
        val transportClient = object : TransportClient {
            override suspend fun invoke(request: TransportRequest): TransportResponse = throw NotImplementedError()
        }

        val objectMapper = vkCoreObjectMapper()

        base = object : MethodExecutor {
            override val transportClient: TransportClient = transportClient
            override val objectMapper: ObjectMapper = objectMapper

            override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*, *>>): VkResponse<*> {
                val serializedRequest = objectMapper.serializeMethod(dynamicRequest.get())

                return VkResponse(
                    response = null,
                    error = VkError(
                        errorCode = 7357,
                        errorMsg = "Unimplemented",
                        requestParams = serializedRequest.map { VkError.MapEntry(it.key, it.value) }
                    )
                )
            }
        }
    }

    @Test
    fun testThroughput(): Unit = runBlocking {
        val multiToken = MultiTokenMethodExecutor(
            base = base,
            coroutineContext = coroutineContext,
            rateLimit = 2,
            ratePeriod = Duration.ofSeconds(1),
            tokens = listOf("foo", "bar", "baz", "qux", "quux").map { GroupToken(it) }
        )

        val client = GroupClient(multiToken)

        val start = Instant.now()

        (1..100).map { id ->
            async {
                try {
                    val method = VkMethod<Int, GroupMethod>(
                        apiMethodName = "test.method",
                        responseType = jacksonTypeRef()
                    )
                    method.unsafeParam("request_id", id)

                    client(method)
                } catch (e: VkApiException) {
                    val requestIdParam = e.vkError.requestParams.find { it.key == "request_id" }!!.value
                    assertTrue(requestIdParam == id.toString())
                }
            }
        }.forEach {
            it.await()
        }

        val elapsed = Duration.between(start, Instant.now())
        assertTrue(elapsed < Duration.ofSeconds(11), "Too slow :(")
        multiToken.close()
    }

    @Test
    fun testAdditionRemoval(): Unit = runBlocking {
        val tokens = (1..20).map { GroupToken(accessToken = it.toString()) }

        val multiToken = MultiTokenMethodExecutor(
            base = base,
            coroutineContext = coroutineContext,
            rateLimit = 2,
            ratePeriod = Duration.ofSeconds(1)
        )

        val client = GroupClient(multiToken)

        coroutineScope {
            (1..1000).map { id ->
                async {
                    try {
                        val method = VkMethod<Int, GroupMethod>(
                            apiMethodName = "test.method",
                            responseType = jacksonTypeRef()
                        )
                        method.unsafeParam("request_id", id)

                        client(method)
                    } catch (e: VkApiException) {
                        println(id)
                    }
                }
            }

            repeat(50) {
                if (multiToken.tokens.isEmpty() || Random.nextDouble() < 0.6) {
                    val token = tokens.random()
                    println("Add token: $token")
                    multiToken.addToken(token)
                } else {
                    val token = multiToken.tokens.random()
                    println("Remove token: $token")
                    assertTrue(multiToken.removeTokenAndJoin(token))
                }
                delay(Duration.ofSeconds(2))
            }
        }

        multiToken.close()
    }

    @Test
    fun testEarlyClosing(): Unit = runBlocking {
        val multiToken = MultiTokenMethodExecutor(
            base = base,
            coroutineContext = coroutineContext,
            rateLimit = 2,
            ratePeriod = Duration.ofSeconds(1),
            tokens = listOf("foo", "bar", "baz").map { GroupToken(it) }
        )

        val client = GroupClient(multiToken)

        val completedWithVkError: MutableSet<Int> = ConcurrentHashMap<Int, Unit>().keySet(Unit)
        val cancelled: MutableSet<Int> = ConcurrentHashMap<Int, Unit>().keySet(Unit)

        coroutineScope {
            (1..100).map { id ->
                async {
                    try {
                        client(VkMethod(apiMethodName = "test.method", responseType = jacksonTypeRef<Int>()))
                    } catch (e: VkApiException) {
                        completedWithVkError.add(id)
                    } catch (e: CancellationException) {
                        cancelled.add(id)
                    }
                }
            }

            delay(Duration.ofMillis(5500))
            multiToken.close()
        }

        assertEquals(completedWithVkError, (1..30).toSet())
        assertEquals(cancelled, (31..100).toSet())
    }
}
