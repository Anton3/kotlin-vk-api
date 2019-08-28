@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

/**
 * No description
 *
 * @property items No description
 * @property nextFrom Value for pagination
 */
data class GetHistoryAttachmentsResponse(
    val items: List<HistoryAttachment>? = null,
    val nextFrom: String? = null
)
