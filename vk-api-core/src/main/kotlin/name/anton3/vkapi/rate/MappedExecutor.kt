package name.anton3.vkapi.rate

class MappedDynamicRequest<Request, BaseRequest>(
    private val base: DynamicRequest<BaseRequest>,
    private val preprocessor: (BaseRequest) -> Request
) : DynamicRequest<Request>() {

    override val isIncompleteBatch: Boolean
        get() = base.isIncompleteBatch

    override suspend fun finalize(): Request {
        return preprocessor(base.get())
    }
}

class MappedDynamicExecutor<Request, Response, BaseRequest, BaseResponse>(
    private val base: DynamicExecutor<BaseRequest, BaseResponse>,
    private val preprocessor: (Request) -> BaseRequest,
    private val postprocessor: (BaseResponse) -> Response
) : DynamicExecutor<Request, Response> {

    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response {
        return postprocessor(base.execute(MappedDynamicRequest(dynamicRequest, preprocessor)))
    }
}
