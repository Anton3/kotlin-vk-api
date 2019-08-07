package name.anton3.vkapi.methods.longpoll.events

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import name.anton3.vkapi.generated.messages.objects.MessageActionStatus
import name.anton3.vkapi.vktypes.PropertyExists

@JsonIgnoreProperties(ignoreUnknown = true)
data class ExtraFields(
    val title: String?,
    val from: Int?,
    val sourceAct: MessageActionStatus?,
    val sourceMid: Int?,
    val fromAdmin: Int?,
    val geo: String?,
    val emoji: PropertyExists?
)
