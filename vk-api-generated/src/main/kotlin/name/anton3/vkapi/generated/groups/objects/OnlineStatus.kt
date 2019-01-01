package name.anton3.vkapi.generated.groups.objects

/**
 * Online status of group
 *
 * @property status No description
 * @property minutes Estimated time of answer (for status = answer_mark)
 */
data class OnlineStatus(
    val status: OnlineStatusType,
    val minutes: Int? = null
)
