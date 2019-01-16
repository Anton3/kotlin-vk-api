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
    postprocessor: (ResponseBase) -> Response
): CompletableDeferred<Response> {
    val result = CompletableDeferred<Response>()
    CoroutineScope(context).launch {
        result.complete { postprocessor(this@andThen.await()) }
    }
    return result
}

fun <Response, ResponseBase> CompletableDeferred<ResponseBase>.dependOn(
    context: CoroutineContext,
    postprocessor: (Response) -> ResponseBase
): CompletableDeferred<Response> {
    val result = CompletableDeferred<Response>()
    CoroutineScope(context).launch {
        complete { postprocessor(result.await()) }
    }
    return result
}


inline fun <Request, Response> SuspendedRequest<Request, Response>.complete(block: (Request) -> Response) {
    response.complete { block(request) }
}


class MappedRequestProducer<Request, Response, BaseRequest, BaseResponse>(
    private val context: CoroutineContext,
    private val base: RequestProducer<BaseRequest, BaseResponse>,
    private val preprocessor: (BaseRequest) -> Request,
    private val postprocessor: (Response) -> BaseResponse
) : RequestProducer<Request, Response> {

    override val isUrgent: Boolean
        get() = base.isUrgent

    override suspend fun sendRequest(): SuspendedRequest<Request, Response>? {
        return base.sendRequest()?.let { suspendedRequest ->
            SuspendedRequest(
                request = preprocessor(suspendedRequest.request),
                response = suspendedRequest.response.dependOn(context, postprocessor)
            )
        }
    }
}
