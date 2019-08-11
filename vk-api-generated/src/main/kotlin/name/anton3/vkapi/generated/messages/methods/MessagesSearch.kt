@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.messages.objects.Message
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/messages.search]
 *
 * Returns a list of the current user's private messages that match search criteria.
 *
 * @property q Search query string.
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property date Date to search message before in Unixtime.
 * @property previewLength Number of characters after which to truncate a previewed message. To preview the full message, specify '0'. "NOTE: Messages are not truncated by default. Messages are truncated by words."
 * @property offset Offset needed to return a specific subset of messages.
 * @property count Number of messages to return.
 * @property groupId Group ID (for group messages with group access token)
 */
data class MessagesSearch(
    var q: String? = null,
    var peerId: Int? = null,
    var date: Int? = null,
    var previewLength: Int? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var groupId: Int? = null
) : CheckedMethod<VkList<Message>, UserGroupMethod>("messages.search", jacksonTypeRef())
