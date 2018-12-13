package name.alatushkin.vkapi.json.deser

import com.fasterxml.jackson.databind.JsonNode
import mu.KotlinLogging
import name.alatushkin.vkapi.methods.longpoll.Events
import name.alatushkin.vkapi.methods.longpoll.LongPollEvent
import name.alatushkin.vkapi.methods.longpoll.MessageAdded

object LongPollEventsDeserializer {
    fun decode(updatesNode: JsonNode): List<MessageAdded> {
        return updatesNode.iterator().asSequence()
            .map { updateNode ->
                val event = Events.byId(updateNode.get(0).asInt())?.create(updateNode)
                decodeSingleEvent(event)
            }
            .filterNotNull().toList()
    }

    private fun decodeSingleEvent(event: LongPollEvent?): MessageAdded? {
        if (event == null)
            return null

        return if (event.event === Events.MESSAGE_ADDED) {
            MessageAdded::class.java.cast(event)
        } else null
    }
}
