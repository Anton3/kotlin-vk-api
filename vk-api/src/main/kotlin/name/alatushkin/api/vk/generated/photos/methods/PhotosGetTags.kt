@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.photos.objects.PhotoTag
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getTags]
 *
 * Returns a list of tags on a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property accessKey 
 */
data class PhotosGetTags(
    var ownerId: Long? = null,
    var photoId: Long,
    var accessKey: String? = null
) : VkMethod<List<PhotoTag>>(
    "photos.getTags",
    jacksonTypeRef()
), UserMethod
