package name.anton3.vkapi.transport

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
