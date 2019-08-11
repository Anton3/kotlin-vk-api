@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.UploadServer
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/photos.getChatUploadServer]
 *
 * Returns an upload link for chat cover pictures.
 *
 * @property chatId ID of the chat for which you want to upload a cover photo.
 * @property cropX 
 * @property cropY 
 * @property cropWidth Width (in pixels) of the photo after cropping.
 */
data class PhotosGetChatUploadServer(
    var chatId: Int,
    var cropX: Int? = null,
    var cropY: Int? = null,
    var cropWidth: Int? = null
) : CheckedMethod<UploadServer, UserMethod>("photos.getChatUploadServer", jacksonTypeRef())
