@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.photos.objects.PhotoTag
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getTags]
 *
 * Returns a list of tags on a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property accessKey No description
 */
data class PhotosGetTags(
    var ownerId: Int? = null,
    var photoId: Int,
    var accessKey: String? = null
) : VkMethod<List<PhotoTag>>("photos.getTags", jacksonTypeRef()),
    UserMethod
