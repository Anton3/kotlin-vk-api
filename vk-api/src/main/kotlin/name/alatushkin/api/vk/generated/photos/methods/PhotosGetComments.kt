@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.photos.objects.GetCommentsResponse
import name.alatushkin.api.vk.generated.photos.objects.GetCommentsSort
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
data class PhotosGetComments(
    var ownerId: Long? = null,
    var photoId: Long,
    var needLikes: Boolean? = null,
    var startCommentId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var sort: GetCommentsSort? = null,
    var accessKey: String? = null,
    var fields: List<String>? = null
) : VkMethod<GetCommentsResponse>(
    "photos.getComments",
    jacksonTypeRef()
), UserMethod
