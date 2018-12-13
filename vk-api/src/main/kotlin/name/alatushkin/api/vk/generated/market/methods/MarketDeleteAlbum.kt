@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.deleteAlbum]
 *
 * Deletes a collection of items.
 *
 * @property ownerId ID of an collection owner community.
 * @property albumId Collection ID.
 */
data class MarketDeleteAlbum(
    var ownerId: Long,
    var albumId: Long
) : VkMethod<OkResponse>(
    "market.deleteAlbum",
    jacksonTypeRef()
), UserMethod
