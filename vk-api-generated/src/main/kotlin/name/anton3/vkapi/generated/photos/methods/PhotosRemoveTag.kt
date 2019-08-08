@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/photos.removeTag]
 *
 * Removes a tag from a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property tagId Tag ID.
 */
data class PhotosRemoveTag(
    var ownerId: Int? = null,
    var photoId: Int,
    var tagId: Int
) : VkMethod<OkResponse>("photos.removeTag", jacksonTypeRef()),
    UserMethod
