@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class BanInfoReason(override val value: Int) : ValueEnum<Int> {
    OTHER(0),
    SPAM(1),
    VERBAL_ABUSE(2),
    STRONG_LANGUAGE(3),
    FLOOD(4)
}
