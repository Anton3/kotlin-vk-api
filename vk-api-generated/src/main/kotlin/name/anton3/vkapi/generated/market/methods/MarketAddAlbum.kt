@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.market.objects.AddAlbumResponse
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/market.addAlbum]
 *
 * Creates new collection of items
 *
 * @property ownerId ID of an item owner community.
 * @property title Collection title.
 * @property photoId Cover photo ID.
 * @property mainAlbum Set as main ('1' – set, '0' – no).
 */
data class MarketAddAlbum(
    var ownerId: Long,
    var title: String,
    var photoId: Long? = null,
    var mainAlbum: Boolean? = null
) : VkMethod<AddAlbumResponse>("market.addAlbum", jacksonTypeRef()),
    UserMethod
