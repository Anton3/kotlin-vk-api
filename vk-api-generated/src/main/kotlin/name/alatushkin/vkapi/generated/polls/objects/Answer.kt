package name.alatushkin.vkapi.generated.polls.objects

/**
 * No description
 *
 * @property id Answer ID
 * @property text Answer text
 * @property votes Votes number
 * @property rate Answer rate in percents
 */
data class Answer(
    val id: Long,
    val text: String,
    val votes: Long,
    val rate: Double
)
