@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/market.editComment]
 *
 * Chages item comment's text
 *
 * @property ownerId ID of an item owner community.
 * @property commentId Comment ID.
 * @property message New comment text (required if 'attachments' are not specified), , 2048 symbols maximum.
 * @property attachments Comma-separated list of objects attached to a comment. The field is submitted the following way: , "'<owner_id>_<media_id>,<owner_id>_<media_id>'", , '' - media attachment type: "'photo' - photo, 'video' - video, 'audio' - audio, 'doc' - document", , '<owner_id>' - media owner id, '<media_id>' - media attachment id, , For example: "photo100172_166443618,photo66748_265827614",
 */
data class MarketEditComment(
    var ownerId: Long,
    var commentId: Long,
    var message: String? = null,
    var attachments: List<String>? = null
) : VkMethod<OkResponse>("market.editComment", jacksonTypeRef()),
    UserMethod
