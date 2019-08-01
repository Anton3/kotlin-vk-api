package name.anton3.executors.util

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Job
import kotlinx.coroutines.withContext
import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest
import kotlin.coroutines.CoroutineContext

class CompletableRequest<out Request, Response>(
    val request: DynamicRequest<Request>,
    private val handle: CompletableDeferred<Response>
) : CompletableDeferred<Response> by handle

internal suspend fun <Request, Response> DynamicRequest<Request>.submit(
    coroutineContext: CoroutineContext,
    block: suspend (CompletableRequest<Request, Response>) -> Unit
): Response {
    return withContext(coroutineContext) {
        val completable = CompletableRequest<Request, Response>(
            request = this@submit,
            handle = CompletableDeferred(coroutineContext[Job])
        )
        block(completable)
        completable.await()
    }
}

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
