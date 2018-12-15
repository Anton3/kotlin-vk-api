@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.photos.objects.SaveOwnerPhotoResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.saveOwnerPhoto]
 *
 * Saves a profile or community photo. Upload URL can be got with the [vk.com/dev/photos.getOwnerPhotoUploadServer|photos.getOwnerPhotoUploadServer] method.
 *
 * @property server parameter returned after [vk.com/dev/upload_files|photo upload].
 * @property hash parameter returned after [vk.com/dev/upload_files|photo upload].
 * @property photo parameter returned after [vk.com/dev/upload_files|photo upload].
 */
data class PhotosSaveOwnerPhoto(
    var server: String? = null,
    var hash: String? = null,
    var photo: String? = null
) : VkMethod<SaveOwnerPhotoResponse>("photos.saveOwnerPhoto", jacksonTypeRef()),
    UserMethod
