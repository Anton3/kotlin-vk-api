package name.anton3.vkapi.rate

interface Executor<Request, Response> {
    suspend fun execute(request: Request): Response
}

interface DynamicExecutor<Request, Response> {
    suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response
}
