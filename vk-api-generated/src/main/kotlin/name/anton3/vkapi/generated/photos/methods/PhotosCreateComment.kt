@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.createComment]
 *
 * Adds a new comment on the photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property message Comment text.
 * @property attachments (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — Media attachment owner ID. '<media_id>' — Media attachment ID. Example: "photo100172_166443618,photo66748_265827614"
 * @property fromGroup '1' — to post a comment from the community
 * @property replyToComment 
 * @property stickerId No description
 * @property accessKey No description
 * @property guid No description
 */
data class PhotosCreateComment(
    var ownerId: Long? = null,
    var photoId: Long,
    var message: String? = null,
    var attachments: List<String>? = null,
    var fromGroup: Boolean? = null,
    var replyToComment: Long? = null,
    var stickerId: Long? = null,
    var accessKey: String? = null,
    var guid: String? = null
) : VkMethod<Long>("photos.createComment", jacksonTypeRef()),
    UserMethod
