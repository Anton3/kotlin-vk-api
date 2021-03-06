@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.photos.objects.PhotoUpload
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/photos.getWallUploadServer]
 *
 * Returns the server address for photo upload onto a user's wall.
 *
 * @property groupId ID of community to whose wall the photo will be uploaded.
 */
data class PhotosGetWallUploadServer(
    var groupId: Int? = null
) : VkMethod<PhotoUpload, UserMethod>("photos.getWallUploadServer", jacksonTypeRef())
