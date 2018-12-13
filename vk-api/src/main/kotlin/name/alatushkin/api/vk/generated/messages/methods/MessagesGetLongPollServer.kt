@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.messages.objects.LongpollParams
import name.alatushkin.api.vk.tokens.UserGroupMethod

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
) : VkMethod<LongpollParams>(
    "messages.getLongPollServer",
    jacksonTypeRef()
), UserGroupMethod
