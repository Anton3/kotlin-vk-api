@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.photos.objects.PhotoUpload
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getUploadServer]
 *
 * Returns the server address for photo upload.
 *
 * @property albumId Album ID.
 * @property groupId ID of community that owns the album (if the photo will be uploaded to a community album).
 */
data class PhotosGetUploadServer(
    var albumId: Long? = null,
    var groupId: Long? = null
) : VkMethod<PhotoUpload>(
    "photos.getUploadServer",
    jacksonTypeRef()
), UserMethod
