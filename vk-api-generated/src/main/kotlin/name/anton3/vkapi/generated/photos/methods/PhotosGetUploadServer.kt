@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.photos.objects.PhotoUpload
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/photos.getUploadServer]
 *
 * Returns the server address for photo upload.
 *
 * @property albumId Album ID.
 * @property groupId ID of community that owns the album (if the photo will be uploaded to a community album).
 */
data class PhotosGetUploadServer(
    var albumId: Int? = null,
    var groupId: Int? = null
) : VkMethod<PhotoUpload>("photos.getUploadServer", jacksonTypeRef()),
    UserMethod
