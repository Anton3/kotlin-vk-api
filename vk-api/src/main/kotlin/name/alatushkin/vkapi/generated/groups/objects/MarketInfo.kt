package name.alatushkin.vkapi.generated.groups.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.market.objects.Currency

data class MarketInfo(
    val enabled: BoolInt? = null,
    val priceMin: Long? = null,
    val priceMax: Long? = null,
    val mainAlbumId: Long? = null,
    val contactId: Long? = null,
    val currency: Currency? = null,
    val currencyText: String? = null
)
