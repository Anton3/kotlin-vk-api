@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.GetCommentsExtendedResponse
import name.alatushkin.api.vk.generated.photos.Sort
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getComments]
 *
 * Returns a list of comments on a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property needLikes '1' — to return an additional 'likes' field, '0' — (default)
 * @property startCommentId 
 * @property offset Offset needed to return a specific subset of comments. By default, '0'.
 * @property count Number of comments to return.
 * @property sort Sort order: 'asc' — old first, 'desc' — new first
 * @property accessKey 
 * @property fields 
 */
class PhotosGetCommentsMethodExtended(
        ownerId: Long? = null,
        photoId: Long,
        needLikes: Boolean? = null,
        startCommentId: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        sort: Sort? = null,
        accessKey: String? = null,
        fields: Array<String>? = null
) : VkMethod<GetCommentsExtendedResponse>(
    "photos.getComments",
    mutableMapOf("extended" to "1"),
    object : TypeReference<VkResponse<GetCommentsExtendedResponse>>() {}
), UserMethod {

    var ownerId: Long? by props
    var photoId: Long by props
    var needLikes: Boolean? by props
    var startCommentId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var sort: Sort? by props
    var accessKey: String? by props
    var fields: Array<String>? by props

    init {
        this.ownerId = ownerId
        this.photoId = photoId
        this.needLikes = needLikes
        this.startCommentId = startCommentId
        this.offset = offset
        this.count = count
        this.sort = sort
        this.accessKey = accessKey
        this.fields = fields
    }

    fun setOwnerId(ownerId: Long): PhotosGetCommentsMethodExtended {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosGetCommentsMethodExtended {
        this.photoId = photoId
        return this
    }

    fun setNeedLikes(needLikes: Boolean): PhotosGetCommentsMethodExtended {
        this.needLikes = needLikes
        return this
    }

    fun setStartCommentId(startCommentId: Long): PhotosGetCommentsMethodExtended {
        this.startCommentId = startCommentId
        return this
    }

    fun setOffset(offset: Long): PhotosGetCommentsMethodExtended {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): PhotosGetCommentsMethodExtended {
        this.count = count
        return this
    }

    fun setSort(sort: Sort): PhotosGetCommentsMethodExtended {
        this.sort = sort
        return this
    }

    fun setAccessKey(accessKey: String): PhotosGetCommentsMethodExtended {
        this.accessKey = accessKey
        return this
    }

    fun setFields(fields: Array<String>): PhotosGetCommentsMethodExtended {
        this.fields = fields
        return this
    }
}
