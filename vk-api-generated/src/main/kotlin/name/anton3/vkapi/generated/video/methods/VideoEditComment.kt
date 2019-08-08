@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.editComment]
 *
 * Edits the text of a comment on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property commentId Comment ID.
 * @property message New comment text.
 * @property attachments List of objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media attachment owner. '<media_id>' — Media attachment ID. Example: "photo100172_166443618,photo66748_265827614"
 */
data class VideoEditComment(
    var ownerId: Int? = null,
    var commentId: Int,
    var message: String? = null,
    var attachments: List<String>? = null
) : VkMethod<OkResponse>("video.editComment", jacksonTypeRef()),
    UserMethod
