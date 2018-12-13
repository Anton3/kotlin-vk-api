@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/market.createComment]
 *
 * Creates a new comment for an item.
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Item ID.
 * @property message Comment text (required if 'attachments' parameter is not specified)
 * @property attachments Comma-separated list of objects attached to a comment. The field is submitted the following way: , "'<owner_id>_<media_id>,<owner_id>_<media_id>'", , '' - media attachment type: "'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document", , '<owner_id>' - media owner id, '<media_id>' - media attachment id, , For example: "photo100172_166443618,photo66748_265827614",
 * @property fromGroup '1' - comment will be published on behalf of a community, '0' - on behalf of a user (by default).
 * @property replyToComment ID of a comment to reply with current comment to.
 * @property stickerId Sticker ID.
 * @property guid Random value to avoid resending one comment.
 */
data class MarketCreateComment(
    var ownerId: Long,
    var itemId: Long,
    var message: String? = null,
    var attachments: List<String>? = null,
    var fromGroup: Boolean? = null,
    var replyToComment: Long? = null,
    var stickerId: Long? = null,
    var guid: String? = null
) : VkMethod<Long>(
    "market.createComment",
    jacksonTypeRef()
), UserMethod
