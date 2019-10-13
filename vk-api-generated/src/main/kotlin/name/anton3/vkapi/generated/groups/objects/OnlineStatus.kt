@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

/**
 * Online status of group
 *
 * @property minutes Estimated time of answer (for status = answer_mark)
 * @property status No description
 */
data class OnlineStatus(
    val minutes: Int? = null,
    val status: OnlineStatusType
)
