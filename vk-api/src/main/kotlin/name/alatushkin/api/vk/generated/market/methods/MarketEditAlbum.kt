@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
    var ownerId: Long,
    var albumId: Long,
    var title: String,
    var photoId: Long? = null,
    var mainAlbum: Boolean? = null
) : VkMethod<OkResponse>(
    "market.editAlbum",
    jacksonTypeRef()
), UserMethod
