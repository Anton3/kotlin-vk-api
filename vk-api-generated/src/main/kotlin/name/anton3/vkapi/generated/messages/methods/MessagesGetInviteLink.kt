@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.messages.objects.GetInviteLinkResponse
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/messages.getInviteLink]
 *
 * No description
 *
 * @property peerId Destination ID.
 * @property reset 1 — to generate new link (revoke previous), 0 — to return previous link.
 * @property groupId Group ID
 */
data class MessagesGetInviteLink(
    var peerId: Int,
    var reset: Boolean? = null,
    var groupId: Int? = null
) : VkMethod<GetInviteLinkResponse, UserGroupMethod>("messages.getInviteLink", jacksonTypeRef())
