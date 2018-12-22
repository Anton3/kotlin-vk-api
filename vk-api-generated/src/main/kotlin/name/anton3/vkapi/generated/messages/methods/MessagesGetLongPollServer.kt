@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.messages.objects.LongpollParams
import name.anton3.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.getLongPollServer]
 *
 * Returns data required for connection to a Long Poll server.
 *
 * @property lpVersion Long poll version
 * @property needPts '1' — to return the 'pts' field, needed for the [vk.com/dev/messages.getLongPollHistory|messages.getLongPollHistory] method.
 * @property groupId Group ID (for group messages with user access token)
 */
data class MessagesGetLongPollServer(
    var lpVersion: Long? = null,
    var needPts: Boolean? = null,
    var groupId: Long? = null
) : VkMethod<LongpollParams>("messages.getLongPollServer", jacksonTypeRef()),
    UserGroupMethod