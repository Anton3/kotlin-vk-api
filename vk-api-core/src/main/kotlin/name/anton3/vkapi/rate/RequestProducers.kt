package name.anton3.vkapi.rate

import java.util.*

class RequestProducers<Request, Response> {
    private val list: MutableList<RequestProducer<Request, Response>> = Collections.synchronizedList(mutableListOf())

    fun add(handler: RequestProducer<Request, Response>) {
        list.add(handler)
    }

    suspend fun produceRequests(maxCount: Int): List<SuspendedRequest<Request, Response>> {

        fun <T, S1: Iterable<T>, S2: Iterable<T>> concatenate(s1: S1, s2: S2) = s1 + s2

        val handlers = list.toTypedArray()

        return concatenate(
            handlers.flatMap { handler ->
                generateList { if (handler.isUrgent) handler.sendRequest() else null }
            },
            handlers.flatMap { handler ->
                generateList { handler.sendRequest() }
            }
        ).take(maxCount).toList()
    }

    suspend fun produceRequest(): SuspendedRequest<Request, Response>? {
        return produceRequests(1).firstOrNull()
    }
}

private inline fun <T> generateList(generator: () -> T?): List<T> {
    val result = mutableListOf<T>()
    var item = generator()
    while (item != null) {
        result.add(item)
        item = generator()
    }
    return result
}
