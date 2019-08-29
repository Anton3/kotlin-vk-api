package name.anton3.vkapi.methods.longpoll

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import name.anton3.vkapi.methods.callback.CallbackEvent
import name.anton3.vkapi.methods.longpoll.events.LongPollEvent
import name.anton3.vkapi.methods.longpoll.objects.LongPollFailure

@JsonIgnoreProperties(ignoreUnknown = true)
data class LongPollResponse<EventType>(
    val failed: LongPollFailure? = null,
    val ts: String? = null,
    val updates: List<EventType> = emptyList()
)

typealias UserLongPollResponse = LongPollResponse<LongPollEvent>
typealias GroupLongPollResponse = LongPollResponse<CallbackEvent<*>>
