@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

/**
 * No description
 *
 * @property attachment No description
 * @property messageId Message ID
 * @property fromId Message author's ID
 */
data class HistoryAttachment(
    val attachment: HistoryMessageAttachment,
    val messageId: Int,
    val fromId: Int
)
