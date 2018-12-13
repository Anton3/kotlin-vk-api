@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.photos.objects.Photo
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/photos.saveMessagesPhoto]
 *
 * Saves a photo after being successfully uploaded. URL obtained with [vk.com/dev/photos.getMessagesUploadServer|photos.getMessagesUploadServer] method.
 *
 * @property photo Parameter returned when the photo is [vk.com/dev/upload_files|uploaded to the server].
 * @property server 
 * @property hash 
 */
data class PhotosSaveMessagesPhoto(
    var photo: String,
    var server: Long? = null,
    var hash: String? = null
) : VkMethod<List<Photo>>(
    "photos.saveMessagesPhoto",
    jacksonTypeRef()
), UserGroupMethod
