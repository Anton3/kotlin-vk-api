package name.anton3.executors.core

interface Executor<Request, Response> {
    suspend fun execute(request: Request): Response
}

interface DynamicExecutor<Request, Response> : Executor<Request, Response> {
    suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response

    override suspend fun execute(request: Request): Response {
        return execute(SimpleDynamicRequest(request))
    }
}


@Suppress("FunctionName")
inline fun <Request, Response> Executor(
    crossinline block: suspend (Request) -> Response
): Executor<Request, Response> =
    object : Executor<Request, Response> {
        override suspend fun execute(request: Request): Response = block(request)
    }

@Suppress("FunctionName")
inline fun <Request, Response> DynamicExecutor(
    crossinline block: suspend (DynamicRequest<Request>) -> Response
): DynamicExecutor<Request, Response> =
    object : DynamicExecutor<Request, Response> {
        override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response = block(dynamicRequest)
    }
