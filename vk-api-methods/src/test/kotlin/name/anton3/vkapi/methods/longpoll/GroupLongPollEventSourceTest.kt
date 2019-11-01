package name.anton3.vkapi.methods.longpoll

import com.fasterxml.jackson.module.kotlin.readValue
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import name.anton3.vkapi.generated.messages.methods.MessagesSend
import name.anton3.vkapi.generated.messages.objects.*
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.methods.callback.MessageNew
import name.anton3.vkapi.utils.*
import org.junit.Assert.assertTrue
import org.junit.Ignore
import org.junit.Test
import kotlin.random.Random

class GroupLongPollEventSourceTest {
    @Test
    @Ignore
    fun smokeTest1(): Unit = runBlocking {
        val source = groupLongPollEvents(groupApi, groupId, timeoutSeconds = longPollTimeout)

        source.collect { event ->
            println(event.toString())

            if (event is MessageNew) {
                println(event.attachment.peerId)
                println(event.attachment.fromId)

                val result = groupApi(makeMessageToSend())
                println(result)
            }
        }
    }

    private fun makeKeyboard(): Keyboard {
        return KeyboardImpl(
            oneTime = true,
            buttons = listOf(
                listOf(
                    KeyboardButton(
                        color = KeyboardButtonColor.DEFAULT,
                        action = KeyboardButtonAction(
                            type = KeyboardButtonActionType.TEXT,
                            payload = "\"some_payload\"",
                            label = "Label"
                        )
                    )
                )
            )
        )
    }

    private fun makeMessageToSend(): MessagesSend {
        return MessagesSend(
            peerId = peerId,
            message = "test",
            randomId = Random.nextInt(),
            keyboard = makeKeyboard()
        )
    }

    @Test
    fun `deserialize message with image attachment`() {
        val json =
            """{"ts":"243","updates":[{"type":"message_new","object":{"date":1542641092,"from_id":5518788,"id":2840,"out":0,"peer_id":5518788,"text":"","conversation_message_id":2728,"fwd_messages":[],"important":false,"random_id":0,"attachments":[{"type":"photo","photo":{"id":430665037,"album_id":-7,"owner_id":5518788,"sizes":[{"type":"m","url":"https:\/\/pp.userapi.com\/c636727\/v636727788\/18429\/vATo5T3lEqA.jpg","width":130,"height":83},{"type":"o","url":"https:\/\/pp.userapi.com\/c636727\/v636727788\/1842d\/gsd9_XrSOdk.jpg","width":130,"height":87},{"type":"p","url":"https:\/\/pp.userapi.com\/c636727\/v636727788\/1842e\/4yL_6vzBXsk.jpg","width":200,"height":133},{"type":"q","url":"https:\/\/pp.userapi.com\/c636727\/v636727788\/1842f\/mFVjMMvUJVU.jpg","width":320,"height":213},{"type":"r","url":"https:\/\/pp.userapi.com\/c636727\/v636727788\/18430\/zqcoJTur_kg.jpg","width":510,"height":340},{"type":"s","url":"https:\/\/pp.userapi.com\/c636727\/v636727788\/18428\/KxwOYSOsiiY.jpg","width":75,"height":48},{"type":"x","url":"https:\/\/pp.userapi.com\/c636727\/v636727788\/1842a\/ZZVCDHtoB40.jpg","width":604,"height":385},{"type":"y","url":"https:\/\/pp.userapi.com\/c636727\/v636727788\/1842b\/T7BwoFxVkos.jpg","width":807,"height":514},{"type":"z","url":"https:\/\/pp.userapi.com\/c636727\/v636727788\/1842c\/e0h9O8E2-nI.jpg","width":1107,"height":705}],"text":"","date":1473353068,"post_id":1202,"access_key":"57f43d7ec925b9f6c3"}}],"is_hidden":false},"group_id":27640201}]}"""
        val lpResponse: GroupLongPollResponse = executor.objectMapper.readValue(json)

        assertTrue(lpResponse.updates.size == 1)
        val message = lpResponse.updates.first().attachment
        assertTrue(message is Message)
        val messageAttachments = (message as Message).attachments!!
        assertTrue(messageAttachments.size == 1)
        val attach = messageAttachments.first()
        assertTrue(attach.body is Photo)
        assertTrue((attach.body as Photo).sizes!!.isNotEmpty())
        executor.objectMapper.writeValueAsString(lpResponse)
    }

    @Test
    fun `deserialize message with voice attachment`() {
        val json =
            """{"ts":"263","updates":[{"type":"message_new","object":{"date":1542645031,"from_id":5518788,"id":2853,"out":0,"peer_id":5518788,"text":"","conversation_message_id":2741,"fwd_messages":[],"important":false,"random_id":0,"attachments":[{"type":"audio_message","audio_message":{"id":481421346,"owner_id":5518788,"duration":4,"waveform":[0,0,0,0,21,31,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,2,5,28,0,9,3,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"link_ogg":"https:\/\/psv4.userapi.com\/c852736\/\/u5518788\/audiomsg\/d8\/8147a0e04c.ogg","link_mp3":"https:\/\/psv4.userapi.com\/c852736\/\/u5518788\/audiomsg\/d8\/8147a0e04c.mp3","access_key":"03a54d08fab1b17a78"}}],"is_hidden":false},"group_id":27640201}]}"""
        val lpResponse: GroupLongPollResponse = executor.objectMapper.readValue(json)
        println(lpResponse)
    }
}
