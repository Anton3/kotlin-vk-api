package name.anton3.vkapi.methods.longpoll

import kotlinx.coroutines.runBlocking
import name.anton3.vkapi.utils.groupApi
import name.anton3.vkapi.utils.httpClient
import name.anton3.vkapi.utils.timeOut
import org.junit.Ignore
import org.junit.Test

class SimpleUserLongPollEventSourceTest {
    @Test
    @Ignore
    fun smokeTest1() = runBlocking {
        val source = SimpleUserLongPollEventSource(
            groupApi,
            httpClient,
            timeOut
        )

        while (true) {
            val (next, events) = source.getEvents()

            println(next.dump())
            println(events)
        }
    }
}
