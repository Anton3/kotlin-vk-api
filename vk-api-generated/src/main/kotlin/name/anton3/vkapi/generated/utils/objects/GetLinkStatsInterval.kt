@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetLinkStatsInterval(override val value: String) : ValueEnum<String> {
    HOUR("hour"),
    DAY("day"),
    WEEK("week"),
    MONTH("month"),
    FOREVER("forever")
}
