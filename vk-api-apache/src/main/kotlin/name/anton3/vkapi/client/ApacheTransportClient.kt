package name.anton3.vkapi.client

import kotlinx.coroutines.*
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.core.TransportRequest
import name.anton3.vkapi.core.TransportResponse
import org.apache.http.Header
import org.apache.http.HttpEntity
import org.apache.http.HttpResponse
import org.apache.http.ProtocolVersion
import org.apache.http.client.config.RequestConfig
import org.apache.http.client.methods.*
import org.apache.http.concurrent.FutureCallback
import org.apache.http.entity.ContentType
import org.apache.http.entity.StringEntity
import org.apache.http.entity.mime.MultipartEntityBuilder
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder
import org.apache.http.nio.client.HttpAsyncClient
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

class ApacheTransportClient(private val client: HttpAsyncClient = defaultHttpAsyncClient()) : TransportClient {

    override suspend fun invoke(request: TransportRequest): TransportResponse {
        val apacheRequest = convertRequest(request)
        val apacheResponse = client.execute(apacheRequest)
        return convertResponse(apacheResponse)
    }

    private fun convertRequest(request: TransportRequest): HttpRequestBase {
        val apacheRequest: HttpRequestBase = when (request.method) {
            "GET" -> HttpGet(request.url)
            "POST" -> HttpPost(request.url)
            "PATCH" -> HttpPatch(request.url)
            "PUT" -> HttpPut(request.url)
            "DELETE" -> HttpDelete(request.url)
            "HEAD" -> HttpHead(request.url)
            "OPTIONS" -> HttpOptions(request.url)
            "TRACE" -> HttpOptions(request.url)
            else -> throw UnsupportedOperationException("Unsupported method: ${request.method}")
        }

        (apacheRequest as? HttpEntityEnclosingRequestBase)?.entity = convertBody(request.body)
        apacheRequest.protocolVersion = ProtocolVersion("HTTP", 1, 1)
        apacheRequest.setHeader("Accept-Charset", "utf-8")

        request.headers.forEach { apacheRequest.addHeader(it.key, it.value) }

        return apacheRequest
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
                when (part) {
                    is TransportRequest.Part.Text -> {
                        val contentType = ContentType.create("text/plain", Charsets.UTF_8)
                        builder.addTextBody(part.key, part.value, contentType)
                    }
                    is TransportRequest.Part.File -> {
                        val contentType = ContentType.create("application/octet-stream", Charsets.UTF_8)
                        builder.addBinaryBody(part.key, part.data, contentType, part.fileName)
                    }
                }
            }
            builder.build()
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

    companion object {
        fun defaultHttpAsyncClient(): HttpAsyncClient {
            val requestConfig = RequestConfig.custom()
                .setConnectTimeout(10000)
                .setSocketTimeout(10000)
                .setConnectionRequestTimeout(10000)
                .build()
            return HttpAsyncClientBuilder.create()
                .setMaxConnTotal(1000)
                .setMaxConnPerRoute(1000)
                .setDefaultRequestConfig(requestConfig)
                .build()
        }
    }
}
