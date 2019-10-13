@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.objects

/**
 * No description
 *
 * @property amount Amount
 * @property currency No description
 * @property discountRate No description
 * @property oldAmount No description
 * @property text Text
 */
data class Price(
    val amount: String? = null,
    val currency: Currency? = null,
    val discountRate: Int? = null,
    val oldAmount: String? = null,
    val text: String? = null
)
