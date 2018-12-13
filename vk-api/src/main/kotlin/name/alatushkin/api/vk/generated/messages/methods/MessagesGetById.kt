@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.messages.objects.Message
import name.alatushkin.api.vk.tokens.UserGroupMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/messages.getById]
 *
 * Returns messages by their IDs.
 *
 * @property messageIds Message IDs.
 * @property previewLength Number of characters after which to truncate a previewed message. To preview the full message, specify '0'. "NOTE: Messages are not truncated by default. Messages are truncated by words."
 * @property extended Information whether the response should be extended
 * @property fields Profile fields to return.
 * @property groupId Group ID (for group messages with group access token)
 */
data class MessagesGetById(
    var messageIds: List<Long>,
    var previewLength: Long? = null,
    var extended: Boolean? = null,
    var fields: List<String>? = null,
    var groupId: Long? = null
) : VkMethod<VkList<Message>>(
    "messages.getById",
    jacksonTypeRef()
), UserGroupMethod
