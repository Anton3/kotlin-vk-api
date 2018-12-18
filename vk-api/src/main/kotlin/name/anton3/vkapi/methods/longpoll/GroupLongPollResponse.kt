package name.anton3.vkapi.methods.longpoll

import name.anton3.vkapi.methods.callback.CallbackEvent

data class GroupLongPollResponse(
    val ts: Long = 0,
    val updates: List<CallbackEvent<*>> = emptyList(),
    val failed: Int? = null
)
