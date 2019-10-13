@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.photos.objects.GetCommentsExtendedResponse
import name.anton3.vkapi.generated.photos.objects.GetCommentsSort
import name.anton3.vkapi.generated.users.objects.Fields
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/photos.getComments]
 *
 * Returns a list of comments on a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property needLikes '1' — to return an additional 'likes' field, '0' — (default)
 * @property startCommentId No description
 * @property offset Offset needed to return a specific subset of comments. By default, '0'.
 * @property count Number of comments to return.
 * @property sort Sort order: 'asc' — old first, 'desc' — new first
 * @property accessKey No description
 * @property fields No description
 */
data class PhotosGetCommentsExtended(
    var ownerId: Int? = null,
    var photoId: Int,
    var needLikes: Boolean? = null,
    var startCommentId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var sort: GetCommentsSort? = null,
    var accessKey: String? = null,
    var fields: List<Fields>? = null
) : VkMethod<GetCommentsExtendedResponse, UserMethod>("photos.getComments", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
