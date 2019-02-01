package name.anton3.vkapi.rate

interface Executor<Request, Response> {
    suspend fun execute(request: Request): Response
}

interface DynamicExecutor<Request, Response> : Executor<Request, Response> {
    suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response

    override suspend fun execute(request: Request): Response {
        return execute(SimpleDynamicRequest(request))
    }
}
