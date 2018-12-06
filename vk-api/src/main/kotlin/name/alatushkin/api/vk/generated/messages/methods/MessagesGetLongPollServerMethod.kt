@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.messages.LongpollParams
import name.alatushkin.api.vk.successReference
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
class MessagesGetLongPollServerMethod(
    lpVersion: Long? = null,
    needPts: Boolean? = null,
    groupId: Long? = null
) : VkMethod<LongpollParams>(
    "messages.getLongPollServer",
    mutableMapOf(),
    successReference()
), UserGroupMethod {

    var lpVersion: Long? by props
    var needPts: Boolean? by props
    var groupId: Long? by props

    init {
        this.lpVersion = lpVersion
        this.needPts = needPts
        this.groupId = groupId
    }
}
