package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.readValue
import kotlinx.coroutines.runBlocking
import name.anton3.vkapi.generated.messages.objects.KeyboardImpl
import name.anton3.vkapi.utils.groupApi
import name.anton3.vkapi.utils.groupId
import name.anton3.vkapi.utils.peerId
import name.anton3.vkapi.utils.userApi
import name.anton3.vkapi.vktypes.VkDate
import org.junit.jupiter.api.Test
import kotlin.random.Random

class MessagesSendMethodTest {
    @Test
    fun smoke1(): Unit = runBlocking {
        val result = groupApi(
            MessagesSend(
                randomId = Random.nextInt(0, Int.MAX_VALUE),
                peerId = peerId,
                groupId = groupId,
                message = "test"
            )
        )
        println(result)
    }

    @Test
    fun smoke2(): Unit = runBlocking {
        val method = MessagesSend(
            randomId = Random.nextInt(0, Int.MAX_VALUE),
            userId = peerId,
            message = "test"
        )
        repeat(20) { println(groupApi(method)) }
    }

    @Test
    fun smoke3(): Unit = runBlocking {
        val result = groupApi(makeMessageToSend())
        println(result)
    }

    @Test
    fun smoke4(): Unit = runBlocking {
        val date = VkDate(123456)

        @Suppress("BlockingMethodInNonBlockingContext")
        val serialized = userApi.objectMapper.writeValueAsString(date)!!

        val deserialized = userApi.objectMapper.readValue<VkDate>(serialized)
        println(date)
        println(serialized)
        println(deserialized)
    }

    private fun makeMessageToSend(): MessagesSend {
        return MessagesSend(
            peerId = peerId,
            message = "Keyboard reset",
            randomId = Random.nextInt(),
            keyboard = KeyboardImpl(oneTime = true, buttons = listOf())
        )
    }
}
