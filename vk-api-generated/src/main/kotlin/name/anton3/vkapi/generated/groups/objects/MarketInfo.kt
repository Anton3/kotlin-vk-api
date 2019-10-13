@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.generated.market.objects.Currency
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property contactId Contact person ID
 * @property currency No description
 * @property currencyText Currency name
 * @property enabled No description
 * @property mainAlbumId Main market album ID
 * @property priceMax Maximum price
 * @property priceMin Minimum price
 */
data class MarketInfo(
    val contactId: Int? = null,
    val currency: Currency? = null,
    val currencyText: String? = null,
    val enabled: BoolInt? = null,
    val mainAlbumId: Int? = null,
    val priceMax: Int? = null,
    val priceMin: Int? = null
)
