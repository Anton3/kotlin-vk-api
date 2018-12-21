@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/photos.getUserPhotos]
 *
 * Returns a list of photos in which a user is tagged.
 *
 * @property userId User ID.
 * @property offset Offset needed to return a specific subset of photos. By default, '0'.
 * @property count Number of photos to return. Maximum value is 1000.
 * @property extended '1' — to return an additional 'likes' field, '0' — (default)
 * @property sort Sort order: '1' — by date the tag was added in ascending order, '0' — by date the tag was added in descending order
 */
data class PhotosGetUserPhotos(
    var userId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var extended: Boolean? = null,
    var sort: String? = null
) : VkMethod<VkList<Photo>>("photos.getUserPhotos", jacksonTypeRef()),
    UserMethod
