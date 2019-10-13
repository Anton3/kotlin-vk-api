@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

import name.anton3.vkapi.generated.market.objects.Price

/**
 * No description
 *
 * @property price No description
 * @property merchant No description
 * @property ordersCount No description
 */
data class LinkProduct(
    val price: Price,
    val merchant: String? = null,
    val ordersCount: Int? = null
)
