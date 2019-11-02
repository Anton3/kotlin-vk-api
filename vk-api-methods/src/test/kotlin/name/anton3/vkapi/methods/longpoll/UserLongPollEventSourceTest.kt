package name.anton3.vkapi.methods.longpoll

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import name.anton3.vkapi.generated.messages.methods.MessagesGetById
import name.anton3.vkapi.methods.longpoll.events.MessageAdded
import name.anton3.vkapi.utils.groupApi
import name.anton3.vkapi.utils.longPollTimeout
import name.anton3.vkapi.utils.userApi
import org.junit.Ignore
import org.junit.Test

@ExperimentalCoroutinesApi
class UserLongPollEventSourceTest {
    @Test
    @Ignore
    fun `Use User LongPoll API to receive limited group events`(): Unit = runBlocking {
        val source = messageLongPollEvents(groupApi, timeoutSeconds = longPollTimeout)

        source.buffer().collect { event ->
            println(event.toString())

            if (event is MessageAdded) {
                val fullMessage = groupApi(MessagesGetById(messageIds = listOf(event.messageId)))
                println(fullMessage.toString())
            }
        }
    }

    @Test
    @Ignore
    fun `Use User LongPoll API to receive user events`(): Unit = runBlocking {
        val source = messageLongPollEventsForUser(userApi, timeoutSeconds = longPollTimeout)

        source.buffer().collect { event ->
            println(event.toString())

            if (event is MessageAdded) {
                val fullMessage = userApi(MessagesGetById(messageIds = listOf(event.messageId)))
                println(fullMessage.toString())
            }
        }
    }
}
