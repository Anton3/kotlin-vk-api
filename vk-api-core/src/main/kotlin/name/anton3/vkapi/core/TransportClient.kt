@file:Suppress("ArrayInDataClass")

package name.anton3.vkapi.core

// Must ensure UTF-8 everywhere
// Must support at least GET and POST methods
interface TransportClient {

    // Throws IOException on network error
    suspend operator fun invoke(request: TransportRequest): TransportResponse
}


// NB: contentType is value of Content-Type excluding encoding
data class TransportRequest(
    val url: String,
    val method: String,
    val body: Body = Body.Empty,
    val headers: Map<String, String> = emptyMap()
) {
    sealed class Body {
        object Empty : Body()

        data class Text(val data: String, val contentType: String) : Body()

        data class Form(val parts: List<Part>) : Body()
    }

    sealed class Part {
        data class Text(
            val key: String,
            val value: String
        ) : Part()

        data class File(
            val key: String,
            val fileName: String,
            val data: ByteArray
        ) : Part()
    }
}

data class TransportResponse(
    val status: Int,
    val data: ByteArray,
    val headers: Map<String, String>
)


suspend inline fun TransportClient.get(url: String): TransportResponse =
    invoke(TransportRequest(url, "GET"))

suspend inline fun TransportClient.post(url: String, parts: List<TransportRequest.Part>): TransportResponse =
    invoke(TransportRequest(url, "POST", TransportRequest.Body.Form(parts)))

suspend inline fun TransportClient.post(
    url: String,
    key: String,
    fileName: String,
    data: ByteArray
): TransportResponse =
    post(url, listOf(TransportRequest.Part.File(key, fileName, data)))
