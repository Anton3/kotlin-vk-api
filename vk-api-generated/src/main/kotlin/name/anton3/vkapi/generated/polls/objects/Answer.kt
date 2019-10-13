@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.polls.objects

/**
 * No description
 *
 * @property id Answer ID
 * @property rate Answer rate in percents
 * @property text Answer text
 * @property votes Votes number
 */
data class Answer(
    val id: Int,
    val rate: Double,
    val text: String,
    val votes: Int
)
