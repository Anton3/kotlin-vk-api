@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.likes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.likes.objects.DeleteResponse
import name.alatushkin.api.vk.generated.likes.objects.Type
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/likes.delete]
 *
 * Deletes the specified object from the 'Likes' list of the current user.
 *
 * @property type Object type: 'post' — post on user or community wall, 'comment' — comment on a wall post, 'photo' — photo, 'audio' — audio, 'video' — video, 'note' — note, 'photo_comment' — comment on the photo, 'video_comment' — comment on the video, 'topic_comment' — comment in the discussion, 'sitepage' — page of the site where the [vk.com/dev/Like|Like widget] is installed
 * @property ownerId ID of the user or community that owns the object.
 * @property itemId Object ID.
 */
data class LikesDelete(
    var type: Type,
    var ownerId: Long? = null,
    var itemId: Long
) : VkMethod<DeleteResponse>(
    "likes.delete",
    jacksonTypeRef()
), UserMethod
