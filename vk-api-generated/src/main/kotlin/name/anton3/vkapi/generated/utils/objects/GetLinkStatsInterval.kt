@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetLinkStatsInterval(override val value: String) : ValueEnum<String> {
    DAY("day"),
    FOREVER("forever"),
    HOUR("hour"),
    MONTH("month"),
    WEEK("week")
}
