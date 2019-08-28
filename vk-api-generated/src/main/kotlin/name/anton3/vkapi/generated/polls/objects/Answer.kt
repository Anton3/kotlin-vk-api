@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.polls.objects

/**
 * No description
 *
 * @property id Answer ID
 * @property text Answer text
 * @property votes Votes number
 * @property rate Answer rate in percents
 */
data class Answer(
    val id: Int,
    val text: String,
    val votes: Int,
    val rate: Double
)
