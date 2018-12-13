@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.messages.objects.DeleteChatPhotoResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.deleteChatPhoto]
 *
 * Deletes a chat's cover picture.
 *
 * @property chatId Chat ID.
 */
data class MessagesDeleteChatPhoto(
    var chatId: Long
) : VkMethod<DeleteChatPhotoResponse>(
    "messages.deleteChatPhoto",
    jacksonTypeRef()
), UserMethod
