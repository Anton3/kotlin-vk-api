package name.anton3.vkapi.rate

class SimpleBatchStrategy<Request, Response>(
    private val batchSizeLimit: Int,
    private val executor: suspend (List<Request>) -> List<Response>
) : BatchStrategy<Request, Response> {

    override fun isFull(requests: List<Request>): Boolean {
        return requests.size >= batchSizeLimit
    }

    override fun shouldFlushOnTimeout(): Boolean {
        return true
    }

    override suspend fun selectBatch(requests: List<Request>): SelectedBatch<Request, Response> {
        return SelectedBatch(requests.take(batchSizeLimit), listOf())
    }

    override suspend fun execute(batch: List<Request>): List<Response> = executor(batch)
}
