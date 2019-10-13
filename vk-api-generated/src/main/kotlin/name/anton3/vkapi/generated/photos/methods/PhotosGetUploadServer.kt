@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.photos.objects.PhotoUpload
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/photos.getUploadServer]
 *
 * Returns the server address for photo upload.
 *
 * @property groupId ID of community that owns the album (if the photo will be uploaded to a community album).
 * @property albumId No description
 */
data class PhotosGetUploadServer(
    var groupId: Int? = null,
    var albumId: Int? = null
) : VkMethod<PhotoUpload, UserMethod>("photos.getUploadServer", jacksonTypeRef())
