package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property id Chat ID
 * @property type Chat type
 * @property title Chat title
 * @property adminId Chat creator ID
 * @property users No description
 * @property pushSettings No description
 * @property photo50 URL of the preview image with 50 px in width
 * @property photo100 URL of the preview image with 100 px in width
 * @property photo200 URL of the preview image with 200 px in width
 * @property left Shows that user has been left the chat
 * @property kicked Shows that user has been kicked from the chat
 */
data class Chat(
    val id: Int,
    val type: String,
    val title: String? = null,
    val adminId: Int,
    val users: List<Int>,
    val pushSettings: ChatPushSettings? = null,
    val photo50: String? = null,
    val photo100: String? = null,
    val photo200: String? = null,
    val left: BoolInt? = null,
    val kicked: BoolInt? = null
)
