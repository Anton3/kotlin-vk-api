package name.anton3.vkapi.transport

import kotlinx.coroutines.*
import org.apache.http.Header
import org.apache.http.HttpEntity
import org.apache.http.HttpResponse
import org.apache.http.ProtocolVersion
import org.apache.http.client.config.RequestConfig
import org.apache.http.client.methods.HttpUriRequest
import org.apache.http.client.methods.RequestBuilder
import org.apache.http.concurrent.FutureCallback
import org.apache.http.entity.ContentType
import org.apache.http.entity.StringEntity
import org.apache.http.entity.mime.MultipartEntityBuilder
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder
import org.apache.http.nio.client.HttpAsyncClient
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.InputStream
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

suspend fun HttpAsyncClient.execute(request: HttpUriRequest): HttpResponse {
    return suspendCancellableCoroutine { cont: CancellableContinuation<HttpResponse> ->
        val future = this.execute(request, object : FutureCallback<HttpResponse> {
            override fun completed(result: HttpResponse) {
                cont.resume(result)
            }

            override fun cancelled() {
                cont.cancel()
            }

            override fun failed(ex: Exception) {
                cont.resumeWithException(ex)
            }
        })

        cont.cancelFutureOnCancellation(future)
    }
}

class ApacheTransportClient(private val client: HttpAsyncClient) : TransportClient {

    override suspend fun invoke(request: TransportRequest): TransportResponse {
        val apacheRequest = convertRequest(request)
        val apacheResponse = client.execute(apacheRequest)
        return convertResponse(apacheResponse)
    }

    private fun convertRequest(request: TransportRequest): HttpUriRequest {
        val builder = RequestBuilder.create(request.method)
        builder.setUri(request.url)
        builder.version = ProtocolVersion("HTTP", 1, 1)
        builder.charset = Charsets.UTF_8
        builder.setHeader("Accept-Charset", "utf-8")
        request.headers.forEach { builder.setHeader(it.key, it.value) }
        builder.entity = convertBody(request.body)
        return builder.build()
    }

    private fun convertBody(body: TransportRequest.Body): HttpEntity? = when (body) {
        is TransportRequest.Body.Empty -> {
            null
        }
        is TransportRequest.Body.Text -> {
            StringEntity(body.data, ContentType.create(body.contentType, Charsets.UTF_8))
        }
        is TransportRequest.Body.Form -> {
            val builder = MultipartEntityBuilder.create()
            builder.setContentType(ContentType.create("multipart/form-data", Charsets.UTF_8))
            for (part in body.parts) {
                addPart(builder, part)
            }
            NonComplainingMultipartEntity(builder.build())
        }
    }

    private fun addPart(multipartBuilder: MultipartEntityBuilder, part: TransportRequest.Part) {
        when (part) {
            is TransportRequest.Part.Text -> {
                val contentType = ContentType.create("text/plain", Charsets.UTF_8)
                multipartBuilder.addTextBody(part.key, part.value, contentType)
            }
            is TransportRequest.Part.File -> {
                val contentType = ContentType.create("application/octet-stream", Charsets.UTF_8)
                multipartBuilder.addBinaryBody(part.key, part.data, contentType, part.fileName)
            }
        }
    }

    private suspend fun convertResponse(apacheResponse: HttpResponse): TransportResponse {
        val statusCode = apacheResponse.statusLine.statusCode
        val apacheBody = apacheResponse.entity.content
        val body = withContext(Dispatchers.IO) { apacheBody.buffered().readBytes() }
        val headers = apacheResponse.allHeaders.groupBy { it.name }
            .mapValues { it.value.joinToString(", ", transform = Header::getValue) }
        return TransportResponse(statusCode, body, headers)
    }
}

fun defaultHttpAsyncClient(): CloseableHttpAsyncClient {
    val requestConfig = RequestConfig.custom()
        .setConnectTimeout(10000)
        .setSocketTimeout(10000)
        .setConnectionRequestTimeout(10000)
        .build()
    return HttpAsyncClientBuilder.create()
        .setMaxConnTotal(1000)
        .setMaxConnPerRoute(1000)
        .setDefaultRequestConfig(requestConfig)
        .disableCookieManagement()
        .build()
        .apply { start() }
}


private class ExtractableByteArrayOutputStream(size: Int) : ByteArrayOutputStream(size) {
    val buffer: ByteArray
        get() = buf
}

private class NonComplainingMultipartEntity(base: HttpEntity) : HttpEntity by base {
    override fun getContent(): InputStream {
        val out = ExtractableByteArrayOutputStream(this.contentLength.toInt())
        writeTo(out)
        out.flush()
        return ByteArrayInputStream(out.buffer)
    }
}
