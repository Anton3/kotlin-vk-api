package name.alatushkin.vkapi.generated.groups.objects

import name.alatushkin.vkapi.generated.market.objects.Currency

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
    val enabled: Boolean? = null,
    val priceMin: Long? = null,
    val priceMax: Long? = null,
    val mainAlbumId: Long? = null,
    val contactId: Long? = null,
    val currency: Currency? = null,
    val currencyText: String? = null
)
