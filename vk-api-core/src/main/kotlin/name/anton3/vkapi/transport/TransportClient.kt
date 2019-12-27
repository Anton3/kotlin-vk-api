@file:Suppress("ArrayInDataClass")

package name.anton3.vkapi.transport

import com.fasterxml.jackson.core.io.JsonStringEncoder

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
        object Empty : Body() {
            override fun toString(): String = "Empty"
        }

        data class Text(val data: String, val contentType: String) : Body() {
            override fun toString(): String = "Text($contentType, \"${quote(data)}\")"
        }

        data class Form(val parts: List<Part>) : Body() {
            override fun toString(): String = "Form(${parts.joinToString()})"
        }
    }

    sealed class Part {
        data class Text(val key: String, val value: String) : Part() {
            override fun toString(): String = "\"${quote(key)}\": \"${quote(value)}\""
        }

        data class File(val key: String, val fileName: String, val data: ByteArray) : Part() {
            override fun toString(): String = "\"${quote(key)}\": File(\"${quote(fileName)}\")"
        }
    }
}

data class TransportResponse(
    val status: Int,
    val data: ByteArray,
    val headers: Map<String, String>
)


internal fun quote(str: String): String {
    val result: CharArray = JsonStringEncoder.getInstance().quoteAsString(str)
    return String(result, 0, minOf(result.size, 10000))
}
