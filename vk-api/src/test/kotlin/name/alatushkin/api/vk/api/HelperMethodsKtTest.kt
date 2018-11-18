package name.alatushkin.api.vk.api

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.MethodExecutorImpl
import name.alatushkin.api.vk.accessToken
import name.alatushkin.api.vk.withToken
import name.alatushkin.httpclient.httpClient
import org.junit.Test

class HelperMethodsKtTest {
    @Test
    fun smokeTest1() {
        runBlocking {
            val timeOut = 95
            val httpClient = httpClient(readTimeout = timeOut * 1000)
            val api = MethodExecutorImpl(httpClient).withToken(accessToken)

            val result = api
                .uploadMessagePhoto(
                    5518788,
                    HelperMethodsKtTest::class.java.classLoader.getResourceAsStream("testPicture.jpg").readBytes()
                )
            println(result.toAttachmentId())

        }
    }
}