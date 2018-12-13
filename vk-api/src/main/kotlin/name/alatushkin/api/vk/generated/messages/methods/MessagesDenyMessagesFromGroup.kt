@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.denyMessagesFromGroup]
 *
 * Denies sending message from community to the current user.
 *
 * @property groupId Group ID.
 */
data class MessagesDenyMessagesFromGroup(
    var groupId: Long
) : VkMethod<OkResponse>(
    "messages.denyMessagesFromGroup",
    jacksonTypeRef()
), UserMethod
