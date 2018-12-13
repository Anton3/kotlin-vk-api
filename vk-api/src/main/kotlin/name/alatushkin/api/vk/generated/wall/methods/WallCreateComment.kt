@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.wall.objects.CreateCommentResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/wall.createComment]
 *
 * Adds a comment to a post on a user wall or community wall.
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property postId Post ID.
 * @property fromGroup Group ID.
 * @property message (Required if 'attachments' is not set.) Text of the comment.
 * @property replyToComment ID of comment to reply.
 * @property attachments (Required if 'message' is not set.) List of media objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media ojbect: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media owner. '<media_id>' — Media ID. For example: "photo100172_166443618,photo66748_265827614"
 * @property stickerId Sticker ID.
 * @property guid Unique identifier to avoid repeated comments.
 */
data class WallCreateComment(
    var ownerId: Long? = null,
    var postId: Long,
    var fromGroup: Long? = null,
    var message: String? = null,
    var replyToComment: Long? = null,
    var attachments: List<String>? = null,
    var stickerId: Long? = null,
    var guid: String? = null
) : VkMethod<CreateCommentResponse>(
    "wall.createComment",
    jacksonTypeRef()
), UserMethod
