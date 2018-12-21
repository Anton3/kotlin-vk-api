@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.messages.objects.DeleteChatPhotoResponse
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.deleteChatPhoto]
 *
 * Deletes a chat's cover picture.
 *
 * @property chatId Chat ID.
 */
data class MessagesDeleteChatPhoto(
    var chatId: Long
) : VkMethod<DeleteChatPhotoResponse>("messages.deleteChatPhoto", jacksonTypeRef()),
    UserMethod
