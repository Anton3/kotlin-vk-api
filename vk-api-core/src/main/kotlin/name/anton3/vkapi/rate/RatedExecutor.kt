package name.anton3.vkapi.rate

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

data class SuspendedRequest<out Request, Response>(
    val request: Request,
    val response: CompletableDeferred<Response> = CompletableDeferred()
)

interface RequestProducer<out Request, Response> {
    /**
     * Requests that are received with urgent status are processed before others.
     */
    val isUrgent: Boolean

    /**
     * Must not block or await on the response before returning.
     */
    suspend fun sendRequest(): SuspendedRequest<Request, Response>?
}

interface RatedExecutor<in Request, Response> : CoroutineScope {

    suspend fun execute(request: Request): Response

    /**
     * Possible values:
     * - positive if some requests can be executed immediately;
     * - zero if new requests must wait before execution;
     * - negative if there are some requests awaiting execution.
     */
    val rateLeft: Int

    /**
     * Requests taken inside `producer::sendRequest` are processed out of queue
     */
    fun addRequestProducer(producer: RequestProducer<Request, Response>)
}

fun <Request, Response> RatedExecutor<Request, Response>.execute(suspendedRequest: SuspendedRequest<Request, Response>) {
    launch { suspendedRequest.complete { execute(it) } }
}

val RatedExecutor<*, *>.isThrottling: Boolean
    get() = rateLeft <= 0
