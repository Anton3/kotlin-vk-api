package name.anton3.vkapi.methods.longpoll.events

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class CounterSet(
    override val eventType: Int,
    val count: Int
) : LongPollEvent(eventType)
