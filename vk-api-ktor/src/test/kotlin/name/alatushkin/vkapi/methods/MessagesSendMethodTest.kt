package name.alatushkin.vkapi.methods

import kotlinx.coroutines.runBlocking
import name.alatushkin.vkapi.client.invoke
import name.alatushkin.vkapi.generated.messages.methods.MessagesSend
import name.alatushkin.vkapi.vktypes.utils.groupApi
import name.alatushkin.vkapi.vktypes.utils.groupId
import name.alatushkin.vkapi.vktypes.utils.peerId
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
}
