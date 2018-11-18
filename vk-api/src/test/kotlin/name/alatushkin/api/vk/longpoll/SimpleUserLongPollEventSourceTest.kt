package name.alatushkin.api.vk.longpoll

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield
import name.alatushkin.api.vk.accessToken
import name.alatushkin.api.vk.groupId
import name.alatushkin.httpclient.httpClient
import org.junit.Test

class SimpleUserLongPollEventSourceTest {
    @Test
    fun smokeTest1() {
        runBlocking {
            val timeOut = 95
            val source = SimpleUserLongPollEventSource(
                accessToken, groupId.toLong(),
                httpClient(readTimeout = timeOut * 1000), timeOut
            )
            while (true) {
                val (next, events) = source.getEvents()
                println(next.dump())
                println(events)
                yield()
            }

        }
    }
}