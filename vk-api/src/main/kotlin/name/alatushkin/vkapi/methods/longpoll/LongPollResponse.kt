package name.alatushkin.vkapi.methods.longpoll

import com.fasterxml.jackson.databind.JsonNode
import name.alatushkin.vkapi.json.deser.LongPollEventsDeserializer

data class LongPollResponse(val ts: Long, val updates: JsonNode?, val failed: Int?) {
    val decodedUpdates: List<LongPollEvent>
        get()
        = LongPollEventsDeserializer.decode(updates!!)
}

