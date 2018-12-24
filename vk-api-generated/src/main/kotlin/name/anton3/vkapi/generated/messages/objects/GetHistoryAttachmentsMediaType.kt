package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetHistoryAttachmentsMediaType(@get:JsonValue val value: String) {
    PHOTO("photo"),
    VIDEO("video"),
    DOC("doc"),
    AUDIO("audio"),
    LINK("link"),
    MARKET("market"),
    WALL("wall"),
    SHARE("share")
}
