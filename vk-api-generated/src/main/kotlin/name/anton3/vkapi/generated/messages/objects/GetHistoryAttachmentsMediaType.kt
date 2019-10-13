@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetHistoryAttachmentsMediaType(override val value: String) : ValueEnum<String> {
    AUDIO("audio"),
    AUDIO_MESSAGE("audio_message"),
    DOC("doc"),
    GRAFFITI("graffiti"),
    LINK("link"),
    MARKET("market"),
    PHOTO("photo"),
    SHARE("share"),
    VIDEO("video"),
    WALL("wall")
}
