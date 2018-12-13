@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.likes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.likes.objects.IsLikedResponse
import name.alatushkin.api.vk.generated.likes.objects.IsLikedType
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/likes.isLiked]
 *
 * Checks for the object in the 'Likes' list of the specified user.
 *
 * @property userId User ID.
 * @property type Object type: 'post' — post on user or community wall, 'comment' — comment on a wall post, 'photo' — photo, 'audio' — audio, 'video' — video, 'note' — note, 'photo_comment' — comment on the photo, 'video_comment' — comment on the video, 'topic_comment' — comment in the discussion
 * @property ownerId ID of the user or community that owns the object.
 * @property itemId Object ID.
 */
data class LikesIsLiked(
    var userId: Long? = null,
    var type: IsLikedType,
    var ownerId: Long? = null,
    var itemId: Long
) : VkMethod<IsLikedResponse>(
    "likes.isLiked",
    jacksonTypeRef()
), UserMethod
