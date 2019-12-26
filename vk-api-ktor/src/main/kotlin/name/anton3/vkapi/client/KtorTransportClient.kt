package name.anton3.vkapi.client

import io.ktor.client.HttpClient
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.forms.FormBuilder
import io.ktor.client.request.forms.MultiPartFormDataContent
import io.ktor.client.request.forms.formData
import io.ktor.client.request.header
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.HttpStatement
import io.ktor.client.statement.readBytes
import io.ktor.client.utils.EmptyContent
import io.ktor.http.*
import io.ktor.http.content.OutgoingContent
import io.ktor.http.content.TextContent
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
        is TransportRequest.Body.Form -> {
            MultiPartFormDataContent(formData { body.parts.forEach { processPart(it) } })
        }
    }

    private fun FormBuilder.processPart(part: TransportRequest.Part) {
        val contentType = when (part) {
            is TransportRequest.Part.Text -> ContentType.Text.Plain
            is TransportRequest.Part.File -> guessContentTypeByFilename(part.fileName)
        }.withCharset(Charsets.UTF_8)

        val partHeaders = HeadersBuilder().apply {
            append(HttpHeaders.ContentType, contentType.toString())
            if (part is TransportRequest.Part.File) {
                append(HttpHeaders.ContentDisposition, "filename=${part.fileName}")
            }
        }.build()

        when (part) {
            is TransportRequest.Part.Text -> append(part.key, part.value, partHeaders)
            is TransportRequest.Part.File -> append(part.key, part.data, partHeaders)
        }
    }

    private suspend inline fun convertResponse(ktorResponse: HttpResponse): TransportResponse {
        return TransportResponse(
            status = ktorResponse.status.value,
            data = ktorResponse.readBytes(),
            headers = ktorResponse.headers.entries().associate { it.key to it.value.joinToString(", ") }
        )
    }
}

private fun guessContentTypeByFilename(fileName: String): ContentType {
    return when (fileName.substringAfterLast(".").toLowerCase()) {
        "jpg" -> ContentType.Image.JPEG
        "jpeg" -> ContentType.Image.JPEG
        "gif" -> ContentType.Image.GIF
        "png" -> ContentType.Image.PNG
        "zip" -> ContentType.Application.Zip
        "pdf" -> ContentType.Application.Pdf
        "xml" -> ContentType.Text.Xml
        "csv" -> ContentType.Text.CSV
        "txt" -> ContentType.Text.Plain
        else -> ContentType.Application.OctetStream
    }
}
