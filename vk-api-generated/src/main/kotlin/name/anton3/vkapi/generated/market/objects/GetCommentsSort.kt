@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetCommentsSort(override val value: String) : ValueEnum<String> {
    OLD_TO_NEW("asc"),
    NEW_TO_OLD("desc")
}
