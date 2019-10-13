@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.messages.objects.GetChatPreviewResponse
import name.anton3.vkapi.generated.users.objects.Fields
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/messages.getChatPreview]
 *
 * No description
 *
 * @property peerId No description
 * @property link Invitation link.
 * @property fields Profile fields to return.
 */
data class MessagesGetChatPreview(
    var peerId: Int? = null,
    var link: String? = null,
    var fields: List<Fields>? = null
) : VkMethod<GetChatPreviewResponse, UserMethod>("messages.getChatPreview", jacksonTypeRef())
