@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

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
class VideoEditCommentMethod(
    ownerId: Long? = null,
    commentId: Long,
    message: String? = null,
    attachments: Array<String>? = null
) : VkMethod<Boolean>(
    "video.editComment",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var commentId: Long by props
    var message: String? by props
    var attachments: Array<String>? by props

    init {
        this.ownerId = ownerId
        this.commentId = commentId
        this.message = message
        this.attachments = attachments
    }
}
