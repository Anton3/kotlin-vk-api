package name.anton3.vkapi.methods

import kotlinx.coroutines.runBlocking
import name.anton3.vkapi.client.invoke
import name.anton3.vkapi.generated.messages.methods.MessagesSend
import name.anton3.vkapi.vktypes.utils.groupApi
import name.anton3.vkapi.vktypes.utils.groupId
import name.anton3.vkapi.vktypes.utils.peerId
import org.junit.Test

class MessagesSendMethodTest {
    @Test
    fun smoke1() = runBlocking {
        val result = groupApi(
            MessagesSend(
                peerId = peerId,
                groupId = groupId.toLong(),
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
