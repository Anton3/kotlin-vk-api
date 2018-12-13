package name.alatushkin.vkapi.generated.docs.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetMessagesUploadServerType(@JsonValue val jsonValue: String) {
    DOC("doc"),
    AUDIO_MESSAGE("audio_message");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetMessagesUploadServerType =
            GetMessagesUploadServerType.values().find { it.jsonValue == value }!!
    }
}
