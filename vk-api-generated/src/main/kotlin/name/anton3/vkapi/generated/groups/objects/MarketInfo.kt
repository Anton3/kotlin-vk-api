package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.generated.market.objects.Currency
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property enabled Information whether the market is enabled
 * @property priceMin Minimum price
 * @property priceMax Maximum price
 * @property mainAlbumId Main market album ID
 * @property contactId Contact person ID
 * @property currency No description
 * @property currencyText Currency name
 */
data class MarketInfo(
    val enabled: BoolInt? = null,
    val priceMin: Int? = null,
    val priceMax: Int? = null,
    val mainAlbumId: Int? = null,
    val contactId: Int? = null,
    val currency: Currency? = null,
    val currencyText: String? = null
)
