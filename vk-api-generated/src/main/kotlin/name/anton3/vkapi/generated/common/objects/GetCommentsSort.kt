@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetCommentsSort(override val value: String) : ValueEnum<String> {
    CHRONOLOGICAL("asc"),
    REVERSE_CHRONOLOGICAL("desc")
}
