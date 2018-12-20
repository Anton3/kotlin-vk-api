package name.anton3.vkapi.methods.longpoll

import name.anton3.vkapi.methods.longpoll.events.LongPollEvent
import name.anton3.vkapi.methods.longpoll.objects.LongPollFailure

data class LongPollResponse(
    val failed: LongPollFailure? = null,
    val ts: Long? = null,
    val updates: List<LongPollEvent> = emptyList(),
    val minVersion: Int? = null,
    val maxVersion: Int? = null
)