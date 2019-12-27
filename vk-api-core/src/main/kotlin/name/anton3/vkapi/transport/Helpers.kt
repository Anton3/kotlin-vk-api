package name.anton3.vkapi.transport

import java.nio.charset.Charset

class TransportFormBuilder {
    private val parts: MutableList<TransportRequest.Part> = mutableListOf()

    fun text(key: String, value: String) {
        parts += TransportRequest.Part.Text(key, value)
    }

    fun file(key: String, fileName: String, data: ByteArray) {
        parts += TransportRequest.Part.File(key, fileName, data)
    }

    fun build(): TransportRequest.Body.Form {
        return TransportRequest.Body.Form(parts.toList())
    }
}

suspend inline fun TransportClient.get(
    url: String,
    headers: Map<String, String> = emptyMap()
): TransportResponse =
    invoke(TransportRequest(url, "GET", TransportRequest.Body.Empty, headers))

suspend inline fun TransportClient.post(
    url: String,
    headers: Map<String, String> = emptyMap(),
    body: TransportFormBuilder.() -> Unit
): TransportResponse =
    invoke(TransportRequest(url, "POST", TransportFormBuilder().apply(body).build(), headers))


fun TransportResponse.decodeToString(): String {
    val charsetString = findHeader(headers, "Content-Type")?.let { charsetRegex.find(it) }?.value
    val charset: Charset = if (charsetString != null && Charset.isSupported(charsetString)) {
        Charset.forName(charsetString)
    } else {
        Charsets.UTF_8
    }
    return data.toString(charset)
}

private val charsetRegex = Regex("""(?<=charset=)[a-zA-Z][a-zA-Z0-9\-+.:_]*""")
