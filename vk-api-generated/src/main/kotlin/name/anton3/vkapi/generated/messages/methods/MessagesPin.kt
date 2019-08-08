@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.messages.objects.PinnedMessage
import name.anton3.vkapi.method.UserGroupMethod

/**
 * [https://vk.com/dev/messages.pin]
 *
 * Pin a message by id
 *
 * @property peerId Destination ID. For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'.
 * @property messageId ID of message to pin
 */
data class MessagesPin(
    var peerId: Int,
    var messageId: Int
) : VkMethod<PinnedMessage>("messages.pin", jacksonTypeRef()),
    UserGroupMethod
