package name.anton3.executors.instances

import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest

/**
 * Sets given meta-info on all requests passing through
 */
class KeySettingExecutor<Request, Response, Value : Any>(
    private val base: DynamicExecutor<Request, Response>,
    private val key: DynamicRequest.Key<Value>,
    private val value: Value
) : DynamicExecutor<Request, Response> {

    private inner class KeySettingRequest<Request>(val baseRequest: DynamicRequest<Request>) : DynamicRequest<Request> {
        override suspend fun get(): Request = baseRequest.get()

        override fun <T : Any> get(key: DynamicRequest.Key<T>): T? {
            return if (key == this@KeySettingExecutor.key) {
                @Suppress("UNCHECKED_CAST")
                value as T
            } else {
                baseRequest[key]
            }
        }
    }

    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response {
        return base.execute(KeySettingRequest(dynamicRequest))
    }
}
