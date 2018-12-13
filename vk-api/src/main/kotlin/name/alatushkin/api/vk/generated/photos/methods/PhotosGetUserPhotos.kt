@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.photos.objects.Photo
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

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
) : VkMethod<VkList<Photo>>(
    "photos.getUserPhotos",
    jacksonTypeRef()
), UserMethod
