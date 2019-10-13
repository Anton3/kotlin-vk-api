@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.messages.objects.DeleteChatPhotoResponse
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/messages.deleteChatPhoto]
 *
 * Deletes a chat's cover picture.
 *
 * @property chatId Chat ID.
 * @property groupId No description
 */
data class MessagesDeleteChatPhoto(
    var chatId: Int,
    var groupId: Int? = null
) : VkMethod<DeleteChatPhotoResponse, UserGroupMethod>("messages.deleteChatPhoto", jacksonTypeRef())
