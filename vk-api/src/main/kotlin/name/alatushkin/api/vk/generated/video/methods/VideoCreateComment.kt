@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.createComment]
 *
 * Adds a new comment on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 * @property message New comment text.
 * @property attachments List of objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media attachment owner. '<media_id>' — Media attachment ID. Example: "photo100172_166443618,photo66748_265827614"
 * @property fromGroup '1' — to post the comment from a community name (only if 'owner_id'<0)
 * @property replyToComment 
 * @property stickerId 
 * @property guid 
 */
data class VideoCreateComment(
    var ownerId: Long? = null,
    var videoId: Long,
    var message: String? = null,
    var attachments: List<String>? = null,
    var fromGroup: Boolean? = null,
    var replyToComment: Long? = null,
    var stickerId: Long? = null,
    var guid: String? = null
) : VkMethod<Long>(
    "video.createComment",
    jacksonTypeRef()
), UserMethod
