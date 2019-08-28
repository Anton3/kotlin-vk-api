@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class SearchSort(override val value: Int) : ValueEnum<Int> {
    DURATION(1),
    RELEVANCE(2),
    DATE_ADDED(0)
}
