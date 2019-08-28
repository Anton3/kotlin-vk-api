@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class SearchSort(override val value: Int) : ValueEnum<Int> {
    BY_RATING(0),
    BY_DATE_REGISTERED(1)
}
