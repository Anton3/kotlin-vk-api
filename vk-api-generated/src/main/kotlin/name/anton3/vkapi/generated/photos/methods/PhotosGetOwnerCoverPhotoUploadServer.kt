@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.common.objects.UploadServer
import name.anton3.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/photos.getOwnerCoverPhotoUploadServer]
 *
 * Returns the server address for owner cover upload.
 *
 * @property groupId ID of community that owns the album (if the photo will be uploaded to a community album).
 * @property cropX X coordinate of the left-upper corner
 * @property cropY Y coordinate of the left-upper corner
 * @property cropX2 X coordinate of the right-bottom corner
 * @property cropY2 Y coordinate of the right-bottom corner
 */
data class PhotosGetOwnerCoverPhotoUploadServer(
    var groupId: Long? = null,
    var cropX: Long? = null,
    var cropY: Long? = null,
    var cropX2: Long? = null,
    var cropY2: Long? = null
) : VkMethod<UploadServer>("photos.getOwnerCoverPhotoUploadServer", jacksonTypeRef()),
    UserGroupMethod
