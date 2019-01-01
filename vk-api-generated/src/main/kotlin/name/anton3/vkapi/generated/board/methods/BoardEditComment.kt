@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.board.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/board.editComment]
 *
 * Edits a comment on a topic on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 * @property commentId ID of the comment on the topic.
 * @property message (Required if 'attachments' is not set). New comment text.
 * @property attachments (Required if 'message' is not set.) List of media objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media object: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media owner. '<media_id>' — Media ID. Example: "photo100172_166443618,photo66748_265827614"
 */
data class BoardEditComment(
    var groupId: Int,
    var topicId: Int,
    var commentId: Int,
    var message: String? = null,
    var attachments: List<String>? = null
) : VkMethod<OkResponse>("board.editComment", jacksonTypeRef()),
    UserMethod
