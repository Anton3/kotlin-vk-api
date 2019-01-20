package name.anton3.vkapi.rate

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

inline fun <T> CompletableDeferred<T>.complete(block: () -> T) {
    try {
        complete(block())
    } catch (e: Throwable) {
        completeExceptionally(e)
    }
}

fun <Response, ResponseBase> CompletableDeferred<ResponseBase>.andThen(
    context: CoroutineContext,
    postprocessor: suspend (ResponseBase) -> Response
): CompletableDeferred<Response> {
    val result = CompletableDeferred<Response>()
    CoroutineScope(context).launch {
        result.complete { postprocessor(this@andThen.await()) }
    }
    return result
}

fun <Response, ResponseBase> CompletableDeferred<ResponseBase>.dependOn(
    context: CoroutineContext,
    postprocessor: suspend (Response) -> ResponseBase
): CompletableDeferred<Response> {
    val result = CompletableDeferred<Response>()
    CoroutineScope(context).launch {
        complete { postprocessor(result.await()) }
    }
    return result
}

suspend inline fun <Request, Response> DynamicRequest<Request>.submit(
    block: (SuspendedRequest<Request, Response>) -> Unit
): Response {
    val suspendedRequest = SuspendedRequest<Request, Response>(this)
    block(suspendedRequest)
    return suspendedRequest.await()
}

suspend fun <Request, Response> DynamicExecutor<Request, Response>.execute(suspendedRequest: SuspendedRequest<Request, Response>) {
    suspendedRequest.complete { execute(suspendedRequest.request) }
}
