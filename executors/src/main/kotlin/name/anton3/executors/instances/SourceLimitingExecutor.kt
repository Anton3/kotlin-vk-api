package name.anton3.executors.instances

import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.util.RecentlyStoredCache
import java.time.Clock
import java.time.Duration
import java.time.Instant

/**
 * Something with meaningful equals() and hashCode()
 */
object RequestSource : DynamicRequest.Key<Any>

/**
 * The exception type thrown on per-source rate limit violation
 */
class RateLimitExceededException(val source: Any, nextRequestTime: Instant) :
    Exception("Rate limit exceeded, reset at $nextRequestTime")

/**
 * Limits request rate per source.
 * - Each source has a time resource, which is spent on requests
 * - Initially its value is equal to `fullResetDuration`
 * - Each request costs `timePerRequest`
 * - If time has not yet replenished for a particular source, `RateLimitExceededException` is thrown.
 */
class SourceLimitingExecutor<Request, Response>(
    private val base: DynamicExecutor<Request, Response>,
    private val fullResetDuration: Duration,
    private val timePerRequest: Duration,
    sourcesCacheSize: Int,
    private val clock: Clock = Clock.systemUTC()
) : DynamicExecutor<Request, Response> {

    init {
        require(fullResetDuration > Duration.ZERO)
        require(timePerRequest > Duration.ZERO)
        require(sourcesCacheSize > 0)
    }

    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response {
        val source = dynamicRequest[RequestSource]
        if (source != null) {
            val now: Instant = clock.instant()

            val newResetTime = sourceResetTimes.merge(source) { oldTime ->
                (oldTime?.takeIf { it > now } ?: now) + timePerRequest
            }

            if (Duration.between(now, newResetTime) > fullResetDuration) {
                throw RateLimitExceededException(
                    source,
                    newResetTime - fullResetDuration + timePerRequest
                )
            }
        }
        return base.execute(dynamicRequest)
    }

    private val sourceResetTimes: RecentlyStoredCache<Any, Instant> =
        RecentlyStoredCache(cacheSize = sourcesCacheSize)
}
