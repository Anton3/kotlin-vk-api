package name.anton3.vkapi.generated.docs.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetMessagesUploadServerType(@JsonValue override val value: String) : Value<String> {
    DOC("doc"),
    AUDIO_MESSAGE("audio_message");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): GetMessagesUploadServerType = parseEnum(value)
    }
}
