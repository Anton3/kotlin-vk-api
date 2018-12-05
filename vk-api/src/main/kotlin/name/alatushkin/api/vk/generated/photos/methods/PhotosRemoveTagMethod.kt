@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.removeTag]
 *
 * Removes a tag from a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property tagId Tag ID.
 */
class PhotosRemoveTagMethod(
        ownerId: Long? = null,
        photoId: Long,
        tagId: Long
) : VkMethod<Boolean>(
    "photos.removeTag",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long? by props
    var photoId: Long by props
    var tagId: Long by props

    init {
        this.ownerId = ownerId
        this.photoId = photoId
        this.tagId = tagId
    }

    fun setOwnerId(ownerId: Long): PhotosRemoveTagMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosRemoveTagMethod {
        this.photoId = photoId
        return this
    }

    fun setTagId(tagId: Long): PhotosRemoveTagMethod {
        this.tagId = tagId
        return this
    }
}
