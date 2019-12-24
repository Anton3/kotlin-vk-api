package name.anton3.vkapi.client

import io.ktor.client.HttpClient
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.forms.MultiPartFormDataContent
import io.ktor.client.request.forms.append
import io.ktor.client.request.forms.formData
import io.ktor.client.request.header
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.HttpStatement
import io.ktor.client.statement.readBytes
import io.ktor.client.utils.EmptyContent
import io.ktor.http.*
import io.ktor.http.content.OutgoingContent
import io.ktor.http.content.TextContent
import io.ktor.utils.io.core.writeFully
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.core.TransportRequest
import name.anton3.vkapi.core.TransportResponse

class KtorTransportClient(private val client: HttpClient) : TransportClient {

    override suspend fun invoke(request: TransportRequest): TransportResponse {
        return HttpStatement(convertRequest(request), client).execute { convertResponse(it) }
    }

    private fun convertRequest(request: TransportRequest): HttpRequestBuilder {
        return HttpRequestBuilder().apply {
            method = HttpMethod.parse(request.method)
            url.takeFrom(request.url)
            body = convertBody(request.body)
            header(HttpHeaders.AcceptCharset, "utf-8")
            request.headers.forEach { (key, value) ->
                header(key, value)
            }
        }
    }

    private fun convertBody(body: TransportRequest.Body): OutgoingContent = when (body) {
        is TransportRequest.Body.Empty -> EmptyContent
        is TransportRequest.Body.Text -> {
            TextContent(body.data, ContentType.parse(body.contentType).withCharset(Charsets.UTF_8))
        }
        is TransportRequest.Body.Form -> MultiPartFormDataContent(formData {
            for (part in body.parts) {
                when (part) {
                    is TransportRequest.Part.Text -> append(part.key, part.value)
                    is TransportRequest.Part.File -> {
                        append(part.key, part.fileName) { writeFully(part.data, 0, part.data.size) }
                    }
                }
            }
        })
    }

    private suspend inline fun convertResponse(ktorResponse: HttpResponse): TransportResponse {
        return TransportResponse(
            status = ktorResponse.status.value,
            data = ktorResponse.readBytes(),
            headers = ktorResponse.headers.entries().associate { it.key to it.value.joinToString(", ") }
        )
    }
}
