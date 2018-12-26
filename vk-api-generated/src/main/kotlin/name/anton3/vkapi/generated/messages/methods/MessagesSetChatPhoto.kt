@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.messages.objects.SetChatPhotoResponse
import name.anton3.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.setChatPhoto]
 *
 * Sets a previously-uploaded picture as the cover picture of a chat.
 *
 * @property file Upload URL from the 'response' field returned by the [vk.com/dev/photos.getChatUploadServer|photos.getChatUploadServer] method upon successfully uploading an image.
 */
data class MessagesSetChatPhoto(
    var file: String
) : VkMethod<SetChatPhotoResponse>("messages.setChatPhoto", jacksonTypeRef()),
    UserGroupMethod
