@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/photos.editComment]
 *
 * Edits a comment on a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property commentId Comment ID.
 * @property message New text of the comment.
 * @property attachments (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — Media attachment owner ID. '<media_id>' — Media attachment ID. Example: "photo100172_166443618,photo66748_265827614"
 */
data class PhotosEditComment(
    var ownerId: Int? = null,
    var commentId: Int,
    var message: String? = null,
    var attachments: List<String>? = null
) : CheckedMethod<OkResponse, UserMethod>("photos.editComment", jacksonTypeRef())
