package name.anton3.vkapi.rate

import kotlin.coroutines.CoroutineContext

class MappedRatedExecutor<Request, Response, BaseRequest, BaseResponse>(
    private val base: RatedExecutor<BaseRequest, BaseResponse>,
    private val preprocessor: (Request) -> BaseRequest,
    private val postprocessor: (BaseResponse) -> Response
) : RatedExecutor<Request, Response> {

    override val coroutineContext: CoroutineContext
        get() = base.coroutineContext

    override suspend fun execute(request: Request): Response {
        return postprocessor(base.execute(preprocessor(request)))
    }

    override val rateLeft: Int
        get() = base.rateLeft

    override fun addRequestProducer(producer: RequestProducer<Request, Response>) {
        base.addRequestProducer(MappedRequestProducer(coroutineContext, producer, preprocessor, postprocessor))
    }
}
