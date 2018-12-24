package name.anton3.vkapi.generated.docs.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetMessagesUploadServerType(@get:JsonValue val value: String) {
    DOC("doc"),
    AUDIO_MESSAGE("audio_message")
}
