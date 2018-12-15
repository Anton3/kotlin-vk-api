package name.alatushkin.vkapi.generated.ads.objects

/**
 * No description
 *
 * @property id Client ID
 * @property name Client name
 * @property dayLimit Client's day limit, rubles
 * @property allLimit Client's total limit, rubles
 */
data class Client(
    val id: Long,
    val name: String,
    val dayLimit: String,
    val allLimit: String
)
