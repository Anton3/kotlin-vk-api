package name.anton3.vkapi.methods.longpoll

import com.fasterxml.jackson.module.kotlin.readValue
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import name.anton3.vkapi.generated.messages.methods.MessagesSend
import name.anton3.vkapi.generated.messages.objects.*
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.generated.wall.objects.WallPostAttachmentBodyPhotosList
import name.anton3.vkapi.generated.wall.objects.WallpostToId
import name.anton3.vkapi.methods.callback.MessageNew
import name.anton3.vkapi.methods.utils.safeAttachments
import name.anton3.vkapi.utils.groupApi
import name.anton3.vkapi.utils.groupId
import name.anton3.vkapi.utils.objectMapper
import name.anton3.vkapi.utils.peerId
import org.intellij.lang.annotations.Language
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import kotlin.random.Random

@OptIn(ExperimentalCoroutinesApi::class)
class GroupLongPollEventSourceTest {
    @Test
    @Disabled
    fun `Use Bot LongPoll API to receive events for a group`(): Unit = runBlocking {
        val source = groupLongPollEvents(groupApi, groupId)

        source.buffer().collect { event ->
            println(event.toString())

            if (event is MessageNew) {
                println(event.attachment.message.peerId)
                println(event.attachment.message.fromId)

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
        @Language("json")
        val json =
            """{"ts":"2899180","updates":[{"type":"message_new","object":{"message":{"date":1584566394,"from_id":555644284,"id":0,"out":0,"peer_id":2000000279,"text":"Чувак могёт ракетами кидаться","conversation_message_id":241661,"fwd_messages":[],"important":false,"random_id":0,"attachments":[{"type":"photo","photo":{"id":457239342,"album_id":-3,"owner_id":555644284,"sizes":[{"type":"m","url":"https:\/\/sun9-71.userapi.com\/c857236\/v857236595\/124a55\/PCit_mUBJDc.jpg","width":60,"height":130},{"type":"o","url":"https:\/\/sun9-4.userapi.com\/c857236\/v857236595\/124a5a\/6HJ6J8QqTdc.jpg","width":130,"height":282},{"type":"p","url":"https:\/\/sun9-59.userapi.com\/c857236\/v857236595\/124a5b\/B_490jVwPoo.jpg","width":200,"height":435},{"type":"q","url":"https:\/\/sun9-5.userapi.com\/c857236\/v857236595\/124a5c\/rRso_k6qXPs.jpg","width":320,"height":694},{"type":"r","url":"https:\/\/sun9-72.userapi.com\/c857236\/v857236595\/124a5d\/3c_RcACc_go.jpg","width":510,"height":900},{"type":"s","url":"https:\/\/sun9-20.userapi.com\/c857236\/v857236595\/124a54\/1Dc23unEQNw.jpg","width":35,"height":75},{"type":"w","url":"https:\/\/sun9-3.userapi.com\/c857236\/v857236595\/124a59\/nJXapHnUbeo.jpg","width":945,"height":2048},{"type":"x","url":"https:\/\/sun9-27.userapi.com\/c857236\/v857236595\/124a56\/zBDak2B0RZM.jpg","width":278,"height":604},{"type":"y","url":"https:\/\/sun9-47.userapi.com\/c857236\/v857236595\/124a57\/PGHBk1vdikw.jpg","width":372,"height":807},{"type":"z","url":"https:\/\/sun9-15.userapi.com\/c857236\/v857236595\/124a58\/QUl3gXJ0vTU.jpg","width":498,"height":1080}],"text":"","date":1584566394,"access_key":"23a2cbe266f7bbf17c"}}],"is_hidden":false},"client_info":{"button_actions":["text","vkpay","open_app","location","open_link"],"keyboard":true,"inline_keyboard":true,"lang_id":0}},"group_id":183287114,"event_id":"2bc491893831d3b0d801f2bc122af6697aa4369a"}]}"""
        val lpResponse: GroupLongPollResponse = objectMapper.readValue(json)

        assertTrue(lpResponse.updates.size == 1)
        val message = (lpResponse.updates.first() as MessageNew).attachment.message
        val messageAttachments = message.safeAttachments
        assertTrue(messageAttachments.size == 1)
        val attach = messageAttachments.first()
        assertTrue(attach is Photo)
        assertTrue((attach as Photo).sizes!!.isNotEmpty())
        println(objectMapper.writeValueAsString(lpResponse))
    }

    @Test
    fun `deserialize message with voice attachment`() {
        @Language("json")
        val json =
            """{"ts":"2898704","updates":[{"type":"message_new","object":{"message":{"date":1584565364,"from_id":526252082,"id":0,"out":0,"peer_id":2000000053,"text":"","conversation_message_id":518107,"fwd_messages":[],"important":false,"random_id":0,"attachments":[{"type":"audio_message","audio_message":{"id":543180880,"owner_id":526252082,"duration":2,"waveform":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,26,26,26,26,26,26,0,30,30,30,30,30,30,0,31,31,31,31,31,31,0,29,29,29,29,29,29,0,31,31,31,31,31,31,0,26,26,26,26,26,26,0,28,28,28,28,28,28,0,30,30,30,30,30,30,0,30,30,30,30,30,30,0,29,29,29,29,29,0,31,31,31,31,31,31,0,31,31,31,31,31,31,0,29,29,29,29,29,29,0,28,28,28,28,28,28,0,23,23,23,23,23,23,0,30,30,30,30,30,30,0,31,31,31,31,31,31,0,30,30,30,30,30,30,0,29,29,29,29,29,29,0,31,31,31,31,31,31,0,29,29,29,29,29,29,0,29,29,29,29,29,0,29,29,29,29,29,29,0,27,27,27,27,27,27,0,25,25,25,25,25,25,0,29,29,29,29,29,29,0,31,31,31,31,31,31,0,30,30,30,30,30,30,0,31,31,31,31,31,31,0,28,28,28,28,28,28,0,30,30,30,30,30,30,0,31,31,31,31,31,31,0,28,28,28,28,28,28,0,31,31,31,31,31,31],"link_ogg":"https:\/\/psv4.userapi.com\/c852536\/\/u526252082\/audiomsg\/d12\/c02eb6b2fb.ogg","link_mp3":"https:\/\/psv4.userapi.com\/c852536\/\/u526252082\/audiomsg\/d12\/c02eb6b2fb.mp3","access_key":"d811695893182efd91"}}],"is_hidden":false},"client_info":{"button_actions":["text","vkpay","open_app","location","open_link"],"keyboard":true,"inline_keyboard":true,"lang_id":0}},"group_id":183287114,"event_id":"ccb98c9b065a00f21971a50830751a274f59f515"}]}"""

        val lpResponse: GroupLongPollResponse = objectMapper.readValue(json)
        println(objectMapper.writeValueAsString(lpResponse))
    }

    @Test
    fun `deserialize message with photos_list attachment`() {
        @Language("json")
        val json =
            """{"ts":"450643","updates":[{"type":"message_new","object":{"message":{"date":1584555168,"from_id":212080679,"id":0,"out":0,"peer_id":2000000266,"text":"🙏🏻🙏🏻🙏🏻🤞🏻🌚","conversation_message_id":59602,"fwd_messages":[],"important":false,"random_id":0,"attachments":[{"type":"wall","wall":{"id":3362,"from_id":212080679,"to_id":212080679,"date":1584543666,"post_type":"post","text":"●Самая лучшая реклама VK\/YouTube\/Instagram, множество способов получения результата, присутсвует таргетинговая и контекстная реклама, быстро качественно и не дорого🌐, при заказе скажи что от меня и получи маленький бонус!😎❤ \n\n●А так-же у нас есть своя группа, где можно пообщаться.😌 vk.me\/join\/AJQ1dzGR\/BViarFm1uRE5sHO","attachments":[{"type":"photo","photo":{"id":457285401,"album_id":-7,"owner_id":212080679,"sizes":[{"type":"m","url":"https:\/\/sun9-63.userapi.com\/c857532\/v857532246\/1a6c94\/u00wtfzgLVo.jpg","width":130,"height":130},{"type":"o","url":"https:\/\/sun9-62.userapi.com\/c857532\/v857532246\/1a6c98\/_zDr5FaeTC8.jpg","width":130,"height":130},{"type":"p","url":"https:\/\/sun9-72.userapi.com\/c857532\/v857532246\/1a6c99\/B8JkI8wJ5_A.jpg","width":200,"height":200},{"type":"q","url":"https:\/\/sun9-19.userapi.com\/c857532\/v857532246\/1a6c9a\/IaC-LPRzgM8.jpg","width":320,"height":320},{"type":"r","url":"https:\/\/sun9-59.userapi.com\/c857532\/v857532246\/1a6c9b\/PM_X_nBr3yA.jpg","width":510,"height":510},{"type":"s","url":"https:\/\/sun9-64.userapi.com\/c857532\/v857532246\/1a6c93\/1TvqrXJnj7o.jpg","width":75,"height":75},{"type":"x","url":"https:\/\/sun9-42.userapi.com\/c857532\/v857532246\/1a6c95\/-vevC4plb4o.jpg","width":604,"height":604},{"type":"y","url":"https:\/\/sun9-44.userapi.com\/c857532\/v857532246\/1a6c96\/lMYGm59ezn8.jpg","width":807,"height":807},{"type":"z","url":"https:\/\/sun9-37.userapi.com\/c857532\/v857532246\/1a6c97\/y__WOGJ5alw.jpg","width":1000,"height":1000}],"text":"","date":1584543660,"access_key":"00e3d204f52ddae1ed"}},{"type":"photos_list","photos_list":["212080679_457285401"]}],"comments":{"count":0},"likes":{"count":54},"reposts":{"count":0},"views":{"count":407},"from":{"type":"profile","id":212080679,"first_name":"Андрей","last_name":"Никольский","is_closed":false,"can_access_closed":true,"photo_50":"https:\/\/sun9-23.userapi.com\/c856120\/v856120943\/1e1cc8\/1ENs7CLDtzI.jpg?ava=1","photo_100":"https:\/\/sun9-24.userapi.com\/c856120\/v856120943\/1e1cc7\/8iGIutJ_ZTQ.jpg?ava=1"}}}],"is_hidden":false},"client_info":{"button_actions":["text","vkpay","open_app","location","open_link"],"keyboard":true,"inline_keyboard":true,"lang_id":0}},"group_id":122914195,"event_id":"f49a1bdb70aea2b51b235bbb7cc3147b84ee819c"}]}"""

        val lpResponse: GroupLongPollResponse = objectMapper.readValue(json)
        val message = (lpResponse.updates[0] as MessageNew).attachment.message
        val wallPostAttachment = message.safeAttachments[0] as WallpostToId
        val photosListAttachment = wallPostAttachment.safeAttachments[1] as WallPostAttachmentBodyPhotosList

        assertTrue(photosListAttachment.photosList.size == 1)
        println(objectMapper.writeValueAsString(lpResponse))
    }
}
