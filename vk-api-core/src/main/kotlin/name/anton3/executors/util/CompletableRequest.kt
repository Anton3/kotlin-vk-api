package name.anton3.executors.util

import kotlinx.coroutines.CompletableDeferred
import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest

class CompletableRequest<out Request, Response>(
    val request: DynamicRequest<Request>,
    private val handle: CompletableDeferred<Response>
) : CompletableDeferred<Response> by handle

internal suspend inline fun <Request, Response> DynamicExecutor<Request, Response>.complete(
    completableRequest: CompletableRequest<Request, Response>
) {
    completableRequest.complete { execute(completableRequest.request) }
}

internal inline fun <T> CompletableDeferred<T>.complete(block: () -> T) {
    try {
        complete(block())
    } catch (e: Throwable) {
        completeExceptionally(e)
    }
}
