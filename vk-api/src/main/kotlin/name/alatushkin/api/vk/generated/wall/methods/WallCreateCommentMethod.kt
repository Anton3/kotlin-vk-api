@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.wall.CreateCommentResponse
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
class WallCreateCommentMethod(
        ownerId: Long? = null,
        postId: Long,
        fromGroup: Long? = null,
        message: String? = null,
        replyToComment: Long? = null,
        attachments: Array<String>? = null,
        stickerId: Long? = null,
        guid: String? = null
) : VkMethod<CreateCommentResponse>(
    "wall.createComment",
    mutableMapOf(),
    object : TypeReference<VkResponse<CreateCommentResponse>>() {}
), UserMethod {

    var ownerId: Long? by props
    var postId: Long by props
    var fromGroup: Long? by props
    var message: String? by props
    var replyToComment: Long? by props
    var attachments: Array<String>? by props
    var stickerId: Long? by props
    var guid: String? by props

    init {
        this.ownerId = ownerId
        this.postId = postId
        this.fromGroup = fromGroup
        this.message = message
        this.replyToComment = replyToComment
        this.attachments = attachments
        this.stickerId = stickerId
        this.guid = guid
    }

    fun setOwnerId(ownerId: Long): WallCreateCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPostId(postId: Long): WallCreateCommentMethod {
        this.postId = postId
        return this
    }

    fun setFromGroup(fromGroup: Long): WallCreateCommentMethod {
        this.fromGroup = fromGroup
        return this
    }

    fun setMessage(message: String): WallCreateCommentMethod {
        this.message = message
        return this
    }

    fun setReplyToComment(replyToComment: Long): WallCreateCommentMethod {
        this.replyToComment = replyToComment
        return this
    }

    fun setAttachments(attachments: Array<String>): WallCreateCommentMethod {
        this.attachments = attachments
        return this
    }

    fun setStickerId(stickerId: Long): WallCreateCommentMethod {
        this.stickerId = stickerId
        return this
    }

    fun setGuid(guid: String): WallCreateCommentMethod {
        this.guid = guid
        return this
    }
}
