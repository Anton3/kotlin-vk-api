@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/messages.unpin]
 *
 * No description
 *
 * @property peerId No description
 * @property groupId No description
 */
data class MessagesUnpin(
    var peerId: Int,
    var groupId: Int? = null
) : VkMethod<OkResponse, UserGroupMethod>("messages.unpin", jacksonTypeRef())
