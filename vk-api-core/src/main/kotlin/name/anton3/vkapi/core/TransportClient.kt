package name.anton3.vkapi.core

enum class HttpMethod {
    GET, POST
}

sealed class RequestContent {
    data class Empty(val contentType: String = FORM_CONTENT_TYPE) : RequestContent()

    data class Text(val data: String, val contentType: String = FORM_CONTENT_TYPE) : RequestContent()

    data class Form(val data: Map<String, String>) : RequestContent()

    class File(val key: String, val fileName: String, val data: ByteArray) : RequestContent()

    companion object {
        const val FORM_CONTENT_TYPE = "application/x-www-form-urlencoded"
    }
}

interface TransportClient {
    suspend operator fun invoke(request: Request): Response

    class Request(val url: String, val method: HttpMethod, val content: RequestContent)
    class Response(val status: Int, val data: ByteArray)
}

suspend fun TransportClient.get(
    url: String,
    content: RequestContent = RequestContent.Empty()
): TransportClient.Response =
    invoke(TransportClient.Request(url, HttpMethod.GET, content))

suspend fun TransportClient.post(
    url: String,
    content: RequestContent = RequestContent.Empty()
): TransportClient.Response =
    invoke(TransportClient.Request(url, HttpMethod.POST, content))
