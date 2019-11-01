package name.anton3.vkapi.methods.longpoll

import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import name.anton3.vkapi.generated.messages.methods.MessagesGetById
import name.anton3.vkapi.methods.longpoll.events.MessageAdded
import name.anton3.vkapi.utils.groupApi
import name.anton3.vkapi.utils.longPollTimeout
import name.anton3.vkapi.utils.userApi
import org.junit.Ignore
import org.junit.Test

class UserLongPollEventSourceTest {
    @Test
    @Ignore
    fun smokeTest1() = runBlocking {
        val source = messageLongPollEvents(groupApi, timeoutSeconds = longPollTimeout)

        source.collect { event ->
            println(event.toString())

            if (event is MessageAdded) {
                val fullMessage = groupApi(MessagesGetById(messageIds = listOf(event.messageId)))
                println(fullMessage.toString())
            }
        }
    }

    @Test
    @Ignore
    fun smokeTest2() = runBlocking {
        val source = messageLongPollEventsForUser(userApi, timeoutSeconds = longPollTimeout)

        source.collect { event ->
            println(event.toString())

            if (event is MessageAdded) {
                val fullMessage = userApi(MessagesGetById(messageIds = listOf(event.messageId)))
                println(fullMessage.toString())
            }
        }
    }
}
