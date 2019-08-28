@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.orders.objects

/**
 * No description
 *
 * @property amounts No description
 * @property currency Currency name
 */
data class Amount(
    val amounts: List<AmountItem>? = null,
    val currency: String? = null
)
