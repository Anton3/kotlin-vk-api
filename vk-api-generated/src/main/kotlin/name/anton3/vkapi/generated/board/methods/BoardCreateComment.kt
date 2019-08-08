@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.board.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/board.createComment]
 *
 * Adds a comment on a topic on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId ID of the topic to be commented on.
 * @property message (Required if 'attachments' is not set.) Text of the comment.
 * @property attachments (Required if 'text' is not set.) List of media objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media object: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media owner. '<media_id>' — Media ID.
 * @property fromGroup '1' — to post the comment as by the community, '0' — to post the comment as by the user (default)
 * @property stickerId Sticker ID.
 * @property guid Unique identifier to avoid repeated comments.
 */
data class BoardCreateComment(
    var groupId: Int,
    var topicId: Int,
    var message: String? = null,
    var attachments: List<String>? = null,
    var fromGroup: Boolean? = null,
    var stickerId: Int? = null,
    var guid: String? = null
) : VkMethod<Int>("board.createComment", jacksonTypeRef()),
    UserMethod
