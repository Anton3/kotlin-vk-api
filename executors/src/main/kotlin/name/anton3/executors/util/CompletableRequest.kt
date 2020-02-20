package name.anton3.executors.util

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Job
import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest
import kotlin.coroutines.CoroutineContext

class CompletableRequest<out Request, Response>(
    val request: DynamicRequest<Request>,
    val handle: CompletableDeferred<Response>
) : DynamicRequest<Request> by request

internal suspend fun <Request, Response> DynamicExecutor<Request, Response>.complete(
    completableRequest: CompletableRequest<Request, Response>
) {
    completableRequest.handle.complete(runCatching { execute(completableRequest.request) })
}

internal fun <T> CompletableDeferred<T>.complete(result: Result<T>): Boolean {
    return result.fold(onSuccess = { complete(it) }, onFailure = { completeExceptionally(it) })
}

internal suspend inline fun <Response> submit(
    context: CoroutineContext,
    block: (CompletableDeferred<Response>) -> Unit
): Response {
    val handle = CompletableDeferred<Response>(parent = context[Job])
    block(handle)
    return handle.await()
}
