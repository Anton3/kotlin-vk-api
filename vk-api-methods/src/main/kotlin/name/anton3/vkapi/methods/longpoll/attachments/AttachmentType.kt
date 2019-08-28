package name.anton3.vkapi.methods.longpoll.attachments

import name.anton3.vkapi.vktypes.ValueEnum

enum class AttachmentType(override val value: String) : ValueEnum<String> {
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
