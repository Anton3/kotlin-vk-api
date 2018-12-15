package name.alatushkin.vkapi.methods.longpoll

import name.alatushkin.vkapi.methods.callback.CallbackEvent

data class GroupLongPollResponse(
    val ts: Long = 0,
    val updates: List<CallbackEvent<*>> = emptyList(),
    val failed: Int? = null
)
