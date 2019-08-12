@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.likes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.likes.objects.AddResponse
import name.anton3.vkapi.generated.likes.objects.Type
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/likes.add]
 *
 * Adds the specified object to the 'Likes' list of the current user.
 *
 * @property type Object type: 'post' — post on user or community wall, 'comment' — comment on a wall post, 'photo' — photo, 'audio' — audio, 'video' — video, 'note' — note, 'photo_comment' — comment on the photo, 'video_comment' — comment on the video, 'topic_comment' — comment in the discussion, 'sitepage' — page of the site where the [vk.com/dev/Like|Like widget] is installed
 * @property ownerId ID of the user or community that owns the object.
 * @property itemId Object ID.
 * @property accessKey Access key required for an object owned by a private entity.
 */
data class LikesAdd(
    var type: Type,
    var ownerId: Int? = null,
    var itemId: Int,
    var accessKey: String? = null
) : VkMethod<AddResponse, UserMethod>("likes.add", jacksonTypeRef())
