package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import name.anton3.vkapi.generated.messages.objects.MessageActionStatus

@JsonIgnoreProperties(ignoreUnknown = true)
data class ExtraFields(
    val title: String?,
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    val from: Int?,
    val sourceAct: MessageActionStatus?,
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    val sourceMid: Int?,
    val sourceText: String?,
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    val fromAdmin: Int?,
    val geo: String?,
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    val emoji: Int?,
    val payload: String?
)
