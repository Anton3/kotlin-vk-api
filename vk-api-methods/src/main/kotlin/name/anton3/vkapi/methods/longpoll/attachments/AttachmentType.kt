package name.anton3.vkapi.methods.longpoll.attachments

import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value

enum class AttachmentType(@JsonValue override val value: String) : Value<String> {
    PHOTO("photo"),
    VIDEO("video"),
    AUDIO("audio"),
    DOC("doc"),
    WALL("wall"),
    STICKER("sticker"),
    LINK("link"),
    MONEY("money"),
    AUDIO_PLAYLIST("audio_playlist"),
    ARTICLE("article"),
    STORY("story"),
    POLL("poll"),
    WALL_REPLY("wall_reply"),
    MONEY_REQUEST("money_request");
}
