@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.generated.users.objects.User

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property profiles No description
 */
data class GetConversationsByIdExtendedResponse(
    val count: Int,
    val items: List<Conversation>,
    val profiles: List<User>? = null
)
