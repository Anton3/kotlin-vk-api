package name.anton3.vkapi.rate

import kotlinx.coroutines.CompletableDeferred

class SuspendedRequest<out Request, Response>(
    val request: DynamicRequest<Request>,
    private val handle: CompletableDeferred<Response> = CompletableDeferred()
) : CompletableDeferred<Response> by handle

suspend inline fun <Request, Response> DynamicRequest<Request>.submit(
    block: (SuspendedRequest<Request, Response>) -> Unit
): Response {
    val suspendedRequest = SuspendedRequest<Request, Response>(this)
    block(suspendedRequest)
    return suspendedRequest.await()
}

suspend fun <Request, Response> DynamicExecutor<Request, Response>.execute(
    suspendedRequest: SuspendedRequest<Request, Response>
) {
    suspendedRequest.complete { execute(suspendedRequest.request) }
}
