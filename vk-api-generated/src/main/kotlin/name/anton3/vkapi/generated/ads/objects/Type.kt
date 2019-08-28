@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class Type(override val value: String) : ValueEnum<String> {
    AD("ad"),
    CAMPAIGN("campaign"),
    CLIENT("client"),
    OFFICE("office")
}
