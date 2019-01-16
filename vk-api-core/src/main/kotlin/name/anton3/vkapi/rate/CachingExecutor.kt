package name.anton3.vkapi.rate

import kotlinx.coroutines.launch
import java.time.Duration
import java.time.Instant
import java.util.*
import kotlin.coroutines.CoroutineContext

class CachingExecutor<Request, Response>(
    private val base: BatchExecutor<Request, Response>,
    private val timeToLive: Duration,
    private val cacheSizeLimit: Int
): RatedExecutor<Request, Response> {

    private data class CacheEntry<Response>(val response: Response, val expirationDate: Instant)

    private val cache: MutableMap<Request, CacheEntry<Response>> = Collections.synchronizedMap(LinkedHashMap())

    override val coroutineContext: CoroutineContext
        get() = base.coroutineContext

    override suspend fun execute(request: Request): Response {
        val cacheEntry = cache[request]

        val now = Instant.now()!!
        if (cacheEntry != null && cacheEntry.expirationDate > now) {
            return cacheEntry.response
        }

        val response = base.execute(request)

        if (cache.size == cacheSizeLimit) cache.remove(cache.entries.first().key)
        cache[request] = CacheEntry(response, now + timeToLive)

        return response
    }

    override val rateLeft: Int
        get() = base.rateLeft

    override fun addRequestProducer(producer: RequestProducer<Request, Response>) {
        base.addRequestProducer(object : RequestProducer<Request, Response> {
            override val isUrgent: Boolean
                get() = producer.isUrgent

            override suspend fun sendRequest(): SuspendedRequest<Request, Response>? {
                var suspendedRequest: SuspendedRequest<Request, Response>
                val now = Instant.now()!!

                while (true) {
                    suspendedRequest = producer.sendRequest() ?: return null

                    val request = suspendedRequest.request
                    val cacheEntry = cache[request]

                    if (cacheEntry != null && cacheEntry.expirationDate > now) {
                        suspendedRequest.response.complete(cacheEntry.response)
                    } else {
                        break
                    }
                }

                launch {
                    val request = suspendedRequest.request
                    val response = suspendedRequest.response.await()

                    suspendedRequest.response.complete(response)

                    if (cache.size == cacheSizeLimit) cache.remove(cache.entries.first().key)
                    cache[request] = CacheEntry(response, now + timeToLive)
                }

                return suspendedRequest
            }
        })
    }
}
