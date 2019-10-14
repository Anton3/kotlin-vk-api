@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.messages.objects.SearchConversationsResponse
import name.anton3.vkapi.generated.users.objects.Fields
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/messages.searchConversations]
 *
 * Returns a list of the current user's conversations that match search criteria.
 *
 * @property q Search query string.
 * @property count Maximum number of results.
 * @property extended '1' — return extra information about users and communities
 * @property fields Profile fields to return.
 * @property groupId Group ID (for group messages with user access token)
 */
data class MessagesSearchConversations(
    var q: String? = null,
    var count: Int? = null,
    var extended: Boolean? = null,
    var fields: List<Fields>? = null,
    var groupId: Int? = null
) : VkMethod<SearchConversationsResponse, UserGroupMethod>("messages.searchConversations", jacksonTypeRef())
