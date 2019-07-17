package name.anton3.vkapi.rate

/**
 * DynamicRequest is a request that is aware of when it is executed.
 */
interface DynamicRequest<out Request> {

    /**
     * Compose and return the request.
     * It's encouraged (but not required) to cache the request, so that on second and later calls,
     * no computations are performed.
     */
    suspend fun get(): Request

    /**
     * Retrieve meta-info about the request, or return null if this kind of meta-info is not present.
     * Executors should not typically require any meta-info. Reasonable defaults should be used.
     * This method is essentially a typed map, bound to each request.
     */
    operator fun <T: Any> get(key: Key<T>): T?

    /**
     * Represents a kind of meta-info that might be bound to the request.
     */
    interface Key<T: Any>
}

/**
 * This trait can be implemented by a DynamicRequest that is some composite batch request.
 * True, if this request still has space for more mini-requests.
 * Default: `false`
 */
object IsIncompleteBatch : DynamicRequest.Key<Boolean>
