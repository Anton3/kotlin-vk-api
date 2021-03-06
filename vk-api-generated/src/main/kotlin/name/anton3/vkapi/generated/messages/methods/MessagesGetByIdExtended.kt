@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.messages.objects.GetByIdExtendedResponse
import name.anton3.vkapi.generated.users.objects.Fields
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/messages.getById]
 *
 * Returns messages by their IDs.
 *
 * @property messageIds Message IDs.
 * @property previewLength Number of characters after which to truncate a previewed message. To preview the full message, specify '0'. "NOTE: Messages are not truncated by default. Messages are truncated by words."
 * @property fields Profile fields to return.
 * @property groupId Group ID (for group messages with group access token)
 */
data class MessagesGetByIdExtended(
    var messageIds: List<Int>,
    var previewLength: Int? = null,
    var fields: List<Fields>? = null,
    var groupId: Int? = null
) : VkMethod<GetByIdExtendedResponse, UserGroupMethod>("messages.getById", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
