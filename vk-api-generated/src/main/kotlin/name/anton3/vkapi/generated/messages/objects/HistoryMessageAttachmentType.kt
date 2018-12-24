package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class HistoryMessageAttachmentType(@get:JsonValue val value: String) {
    PHOTO("photo"),
    VIDEO("video"),
    AUDIO("audio"),
    DOC("doc"),
    LINK("link"),
    MARKET("market"),
    WALL("wall"),
    SHARE("share")
}
