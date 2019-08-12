@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/photos.delete]
 *
 * Deletes a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 */
data class PhotosDelete(
    var ownerId: Int? = null,
    var photoId: Int
) : VkMethod<OkResponse, UserMethod>("photos.delete", jacksonTypeRef())
