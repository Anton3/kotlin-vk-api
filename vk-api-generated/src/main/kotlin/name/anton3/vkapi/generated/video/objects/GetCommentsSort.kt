@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetCommentsSort(override val value: String) : ValueEnum<String> {
    OLDEST_COMMENT_FIRST("asc"),
    NEWEST_COMMENT_FIRST("desc")
}
