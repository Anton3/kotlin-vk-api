@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

/**
 * No description
 *
 * @property allLimit Client's total limit, rubles
 * @property dayLimit Client's day limit, rubles
 * @property id Client ID
 * @property name Client name
 */
data class Client(
    val allLimit: String,
    val dayLimit: String,
    val id: Int,
    val name: String
)
