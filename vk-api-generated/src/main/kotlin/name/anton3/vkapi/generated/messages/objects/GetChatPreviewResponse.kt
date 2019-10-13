@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.generated.message.objects.ChatPreview
import name.anton3.vkapi.generated.users.objects.UserFull

/**
 * No description
 *
 * @property preview No description
 * @property profiles No description
 */
data class GetChatPreviewResponse(
    val preview: ChatPreview? = null,
    val profiles: List<UserFull>? = null
)
