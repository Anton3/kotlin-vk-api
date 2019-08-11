@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.market.objects.AddAlbumResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

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
    var ownerId: Int,
    var title: String,
    var photoId: Int? = null,
    var mainAlbum: Boolean? = null
) : CheckedMethod<AddAlbumResponse, UserMethod>("market.addAlbum", jacksonTypeRef())
