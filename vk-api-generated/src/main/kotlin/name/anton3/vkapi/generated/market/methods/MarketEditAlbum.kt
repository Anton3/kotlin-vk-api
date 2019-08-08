@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/market.editAlbum]
 *
 * Edits a collection of items
 *
 * @property ownerId ID of an collection owner community.
 * @property albumId Collection ID.
 * @property title Collection title.
 * @property photoId Cover photo id
 * @property mainAlbum Set as main ('1' – set, '0' – no).
 */
data class MarketEditAlbum(
    var ownerId: Int,
    var albumId: Int,
    var title: String,
    var photoId: Int? = null,
    var mainAlbum: Boolean? = null
) : VkMethod<OkResponse>("market.editAlbum", jacksonTypeRef()),
    UserMethod
