package name.alatushkin.api.vk.generated.groups.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.market.objects.Currency

data class MarketInfo(
    val enabled: BoolInt? = null,
    val priceMin: Long? = null,
    val priceMax: Long? = null,
    val mainAlbumId: Long? = null,
    val contactId: Long? = null,
    val currency: Currency? = null,
    val currencyText: String? = null
)
