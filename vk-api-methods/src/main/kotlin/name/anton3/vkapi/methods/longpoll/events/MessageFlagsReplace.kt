package name.anton3.vkapi.methods.longpoll.events

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonUnwrapped
import name.anton3.vkapi.methods.longpoll.objects.ExtraFields
import name.anton3.vkapi.methods.longpoll.objects.Flags

data class MessageFlagsReplace(
    override val eventType: Int,
    val messageId: Long,
    val flags: Flags,
    @field:JsonIgnore val extra: ExtraFields?
) : LongPollEvent(eventType) {

    // Workaround for broken Jackson @JsonUnwrapped
    @get:JsonUnwrapped
    private val _extra: ExtraFields?
        get() = extra
}
