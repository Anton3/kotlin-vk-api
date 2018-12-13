package name.alatushkin.vkapi.methods.longpoll

import com.fasterxml.jackson.databind.JsonNode

abstract class LongPollEvent(jsonNodeArray: JsonNode) {
    internal var event: Events = Events.byId(
        jsonNodeArray.get(0).asInt()
    )!!
}
