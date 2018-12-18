package name.alatushkin.vkapi.methods.longpoll

import kotlinx.coroutines.runBlocking
import name.alatushkin.vkapi.vktypes.utils.groupApi
import name.alatushkin.vkapi.vktypes.utils.httpClient
import name.alatushkin.vkapi.vktypes.utils.timeOut
import org.junit.Ignore
import org.junit.Test

class SimpleUserLongPollEventSourceTest {
    @Test
    @Ignore
    fun smokeTest1() = runBlocking {
        val source = SimpleUserLongPollEventSource(groupApi, httpClient, timeOut)

        while (true) {
            val (next, events) = source.getEvents()

            println(next.dump())
            println(events)
        }
    }
}
