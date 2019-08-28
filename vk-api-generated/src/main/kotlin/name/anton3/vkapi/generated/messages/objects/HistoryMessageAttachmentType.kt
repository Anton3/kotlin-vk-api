@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class HistoryMessageAttachmentType(override val value: String) : ValueEnum<String> {
    PHOTO("photo"),
    VIDEO("video"),
    AUDIO("audio"),
    DOC("doc"),
    LINK("link"),
    MARKET("market"),
    WALL("wall"),
    SHARE("share")
}
