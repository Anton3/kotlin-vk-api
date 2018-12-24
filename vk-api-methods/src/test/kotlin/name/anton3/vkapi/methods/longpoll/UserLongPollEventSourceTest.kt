package name.anton3.vkapi.methods.longpoll

import kotlinx.coroutines.runBlocking
import name.anton3.vkapi.client.invoke
import name.anton3.vkapi.generated.messages.methods.MessagesGetById
import name.anton3.vkapi.methods.longpoll.events.MessageAdded
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

            if (event is MessageAdded) {
                val fullMessage = groupApi(MessagesGetById(messageIds = listOf(event.messageId)))
                println(fullMessage.toString())
            }
        }
    }
}
