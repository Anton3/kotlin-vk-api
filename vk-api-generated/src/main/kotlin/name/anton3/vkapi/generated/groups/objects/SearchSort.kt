@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class SearchSort(override val value: Int) : ValueEnum<Int> {
    DEFAULT(0),
    GROWTH(1),
    ATTENDANCE(2),
    LIKES(3),
    COMMENTS(4),
    ENTRIES(5)
}
