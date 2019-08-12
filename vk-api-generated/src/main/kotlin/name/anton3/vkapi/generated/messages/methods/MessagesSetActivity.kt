@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/messages.setActivity]
 *
 * Changes the status of a user as typing in a conversation.
 *
 * @property userId User ID.
 * @property type 'typing' — user has started to type.
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property groupId Group ID (for group messages with group access token)
 */
data class MessagesSetActivity(
    var userId: String? = null,
    var type: String? = null,
    var peerId: Int? = null,
    var groupId: Int? = null
) : VkMethod<OkResponse, UserGroupMethod>("messages.setActivity", jacksonTypeRef())
