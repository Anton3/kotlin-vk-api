@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class SearchSort(override val value: Int) : ValueEnum<Int> {
    DEFAULT(0),
    BY_ADDING_DATE(1),
    BY_PRICE(2),
    BY_POPULARITY(3)
}
