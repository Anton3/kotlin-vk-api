package name.alatushkin.vkapi.methods.longpoll

import com.fasterxml.jackson.databind.JsonNode

interface LongPollEventBuilder {
    val id: Int

    fun deserialize(jsonArrayNode: JsonNode): LongPollEvent
}
