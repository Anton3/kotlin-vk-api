@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class CheckLinkLinkType(override val value: String) : ValueEnum<String> {
    COMMUNITY("community"),
    POST("post"),
    APPLICATION("application"),
    VIDEO("video"),
    SITE("site")
}
