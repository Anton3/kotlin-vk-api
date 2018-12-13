package name.alatushkin.vkapi.generated.messages.methods

import kotlinx.coroutines.runBlocking
import name.alatushkin.vkapi.vktypes.utils.groupApi
import name.alatushkin.vkapi.vktypes.utils.groupId
import name.alatushkin.vkapi.vktypes.utils.peerId
import name.alatushkin.vkapi.client.invoke
import org.junit.Test

class MessagesSendMethodTest {
    @Test
    fun smoke1() = runBlocking {
        val result = groupApi(MessagesSend(
                peerId = peerId,
                groupId = groupId.toLong(),
                message = "test"
        ))
        println(result)
    }
}
