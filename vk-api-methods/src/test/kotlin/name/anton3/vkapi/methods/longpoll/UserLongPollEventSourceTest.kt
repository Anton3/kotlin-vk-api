package name.anton3.vkapi.methods.longpoll

import kotlinx.coroutines.runBlocking
import name.anton3.vkapi.utils.groupApi
import name.anton3.vkapi.utils.timeout
import org.junit.Ignore
import org.junit.Test

class UserLongPollEventSourceTest {
    @Test
    @Ignore
    fun smokeTest1() = runBlocking {
        val source = messageLongPollEvents(groupApi, timeout = timeout)

        for (event in source) {
            println(event.toString())
        }
    }
}
