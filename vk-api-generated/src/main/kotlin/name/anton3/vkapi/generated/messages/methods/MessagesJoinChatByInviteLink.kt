@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.messages.objects.JoinChatByInviteLinkResponse
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/messages.joinChatByInviteLink]
 *
 * No description
 *
 * @property link Invitation link.
 */
data class MessagesJoinChatByInviteLink(
    var link: String
) : VkMethod<JoinChatByInviteLinkResponse, UserMethod>("messages.joinChatByInviteLink", jacksonTypeRef())
