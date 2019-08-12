package name.anton3.executors.instances

import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import name.anton3.executors.core.Executor
import java.time.Duration
import java.time.Instant
import java.util.*

class CachingExecutor<Request, Response>(
    private val base: Executor<Request, Response>,
    private val timeToLive: Duration,
    private val cacheSizeLimit: Int
) : Executor<Request, Response> {

    private data class CacheEntry<Response>(val response: Response, val expirationDate: Instant)

    private val cache: MutableMap<Request, CacheEntry<Response>> = LinkedHashMap()
    private val cacheMutex: Mutex = Mutex()

    override suspend fun execute(request: Request): Response {
        val cacheEntry = cacheMutex.withLock {
            cache[request]
        }

        val now: Instant = Instant.now()
        if (cacheEntry != null && cacheEntry.expirationDate > now) {
            return cacheEntry.response
        }

        val response = base.execute(request)

        cacheMutex.withLock {
            if (cache.size == cacheSizeLimit) cache.remove(cache.entries.first().key)
            cache[request] = CacheEntry(response, now + timeToLive)
        }

        return response
    }
}
