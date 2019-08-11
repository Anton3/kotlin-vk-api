@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.get.objects.InviteLinkResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupMethod

/**
 * [https://vk.com/dev/messages.getInviteLink]
 *
 * Get an invitation link for a chat
 *
 * @property peerId Destination ID
 * @property reset Pass 1 to generate a new link and reset previous one
 * @property groupId For actions on behalf of a group with user token
 */
data class MessagesGetInviteLink(
    var peerId: Int,
    var reset: Boolean? = null,
    var groupId: Int? = null
) : CheckedMethod<InviteLinkResponse, UserGroupMethod>("messages.getInviteLink", jacksonTypeRef())
