@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.photos.objects.CommentXtrPid
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/photos.getAllComments]
 *
 * Returns a list of comments on a specific photo album or all albums of the user sorted in reverse chronological order.
 *
 * @property ownerId ID of the user or community that owns the album(s).
 * @property albumId Album ID. If the parameter is not set, comments on all of the user's albums will be returned.
 * @property needLikes '1' — to return an additional 'likes' field, '0' — (default)
 * @property offset Offset needed to return a specific subset of comments. By default, '0'.
 * @property count Number of comments to return. By default, '20'. Maximum value, '100'.
 */
data class PhotosGetAllComments(
    var ownerId: Long? = null,
    var albumId: Long? = null,
    var needLikes: Boolean? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<CommentXtrPid>>("photos.getAllComments", jacksonTypeRef()),
    UserMethod
