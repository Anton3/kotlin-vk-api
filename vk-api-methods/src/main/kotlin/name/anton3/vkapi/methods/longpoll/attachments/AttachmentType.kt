package name.anton3.vkapi.methods.longpoll.attachments

import name.anton3.vkapi.vktypes.Value

enum class AttachmentType(override val value: String) : Value<String> {
    PHOTO("photo"),
    VIDEO("video"),
    AUDIO("audio"),
    DOC("doc"),
    WALL("wall"),
    STICKER("sticker"),
    LINK("link"),
    MONEY("money");
}
