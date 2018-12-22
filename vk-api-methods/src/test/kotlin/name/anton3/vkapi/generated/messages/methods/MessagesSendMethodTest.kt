package name.anton3.vkapi.generated.messages.methods

import kotlinx.coroutines.runBlocking
import name.anton3.vkapi.client.invoke
import name.anton3.vkapi.utils.groupApi
import name.anton3.vkapi.utils.groupId
import name.anton3.vkapi.utils.peerId
import org.junit.Test

class MessagesSendMethodTest {
    @Test
    fun smoke1() = runBlocking {
        val result = groupApi(
            MessagesSend(
                peerId = peerId,
                groupId = groupId,
                message = "test"
            )
        )
        println(result)
    }

    @Test
    fun smoke2() = runBlocking {
        val method = MessagesSend(
            userId = peerId,
            message = "test"
        )
        repeat(20) { println(groupApi(method)) }
    }
}
