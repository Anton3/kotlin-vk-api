package name.anton3.vkapi.methods.longpoll

import com.fasterxml.jackson.module.kotlin.readValue
import name.anton3.vkapi.json.core.vkObjectMapper
import name.anton3.vkapi.methods.longpoll.events.LongPollEvent
import name.anton3.vkapi.methods.longpoll.events.MessageAdded
import name.anton3.vkapi.methods.longpoll.events.MessageEdited
import org.intellij.lang.annotations.Language
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class UserLongPollParsingTest {
    @Test
    fun testParsingAttachments() {
        @Language("JSON")
        val events = listOf(
            """[4,3252686,532481,2000000052,1565127481,"\/low_members",{"from":"140964698"},{}]""",
            """[4,3252463,532481,2000000030,1565125725,"Мусорка",{"from":"309544882"},{"attach1_type":"photo","attach1":"309544882_457246577"}]""",
            """[4,3252469,532481,2000000017,1565125977,"",{"from":"248644405"},{"attach1_product_id":"380","attach1_type":"sticker","attach1":"12996"}]""",
            """[4,3252511,532481,2000000269,1565126462,"",{"from":"540252655"},{"attach1_type":"doc","attach1":"540252655_512285445","attach1_kind":"audiomsg"}]""",
            """[4,3252564,532481,2000000269,1565126859,"",{"from":"171297502"},{"attach1_type":"audio","attach1":"2000477105_360764397"}]""",
            """[4,3252594,532481,2000000269,1565127084,"",{"from":"171297502"},{"attach1_product_id":"381","attach1_type":"sticker","attach1":"13054","attach1_kind":"animation"}]""",
            """[4,3252687,2629633,2000000269,1565127481,"",{"fwd_all_count":"0","fwd_count":"1","from":"378904836","mentions":[171297502]},{"attach1_type":"audio","attach1":"378904836_456241118","fwd":"0_0"}]""",
            """[4,3253634,532481,2000000269,1565164950,"",{"from":"22461172"},{"attach1_type":"wall","attach1":"-12382740_844534"}]""",
            """[4,3256065,532481,2000000017,1565201628,"Может поможет",{"from":"298397953"},{"attach1_type":"photo","attach1":"298397953_457247954","attach2_type":"photo","attach2":"298397953_457247955","attach3_type":"photo","attach3":"298397953_457247956"}]""",
            """[5,3253072,532481,2000000017,1565131377,"Будет",{"title":"","from":"284656891"},{}]""",
            """[5,3253047,532481,2000000017,1565131281,"Завтра жду деньги",{"title":"","from":"284656891"},{}]""",
            """[5,3255428,532481,2000000017,1565189959,"В оригинале там шёл яд 🌚",{"emoji":"1","title":"","from":"151629538"},{}]""",
            """[5,3252946,532481,2000000269,1565128950,"https:\/\/youtu.be\/p-nI2vNC-Ag",{"from":"171297502"},{"attach1_type":"video","attach1":"171297502_456239816"}]""",
            """[4,3253315,532481,2000000030,1565152987,"a",{},{},0]""",
            """[4,3253315,532481,2000000030,1565152987,"b",{},{},42]"""
        )

        val attachmentCounts = listOf(
            0,
            1,
            1,
            1,
            1,
            1,
            1,
            1,
            3,
            0,
            0,
            0,
            1,
            0,
            0,
            0
        )

        val objectMapper = vkObjectMapper()

        for ((eventJson, attachmentCount) in events.zip(attachmentCounts)) {
            val event = objectMapper.readValue<LongPollEvent>(eventJson)
            assertTrue(event is MessageAdded || event is MessageEdited)

            val attachments = (event as? MessageAdded)?.attachments ?: (event as MessageEdited).attachments!!
            assertTrue(attachments.size == attachmentCount)

            val eventJson2 = objectMapper.writeValueAsString(event)

            // VK returns fields in inconsistent order,
            // so can't assert that String -> Object -> String shouldn't modify the string value
            if (false) assertEquals(eventJson, eventJson2)

            // Assert Object -> String -> Object invariant instead
            assertEquals(event, objectMapper.readValue<LongPollEvent>(eventJson2))

            // println(eventJson2)
        }
    }
}
