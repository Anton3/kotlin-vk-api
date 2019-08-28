@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetCommentsSort(override val value: String) : ValueEnum<String> {
    OLD_FIRST("asc"),
    NEW_FIRST("desc")
}
