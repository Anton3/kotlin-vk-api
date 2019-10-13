@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.messages.objects.LongpollParams
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/messages.getLongPollServer]
 *
 * Returns data required for connection to a Long Poll server.
 *
 * @property needPts '1' — to return the 'pts' field, needed for the [vk.com/dev/messages.getLongPollHistory|messages.getLongPollHistory] method.
 * @property groupId Group ID (for group messages with user access token)
 * @property lpVersion Long poll version
 */
data class MessagesGetLongPollServer(
    var needPts: Boolean? = null,
    var groupId: Int? = null,
    var lpVersion: Int? = null
) : VkMethod<LongpollParams, UserGroupMethod>("messages.getLongPollServer", jacksonTypeRef())
