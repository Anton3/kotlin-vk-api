@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.photos.objects.PhotoUpload
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getWallUploadServer]
 *
 * Returns the server address for photo upload onto a user's wall.
 *
 * @property groupId ID of community to whose wall the photo will be uploaded.
 */
data class PhotosGetWallUploadServer(
    var groupId: Long? = null
) : VkMethod<PhotoUpload>(
    "photos.getWallUploadServer",
    jacksonTypeRef()
), UserMethod
