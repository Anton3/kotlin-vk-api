@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

/**
 * No description
 *
 * @property activities No description
 * @property interests No description
 * @property music No description
 * @property tv No description
 * @property movies No description
 * @property books No description
 * @property games No description
 * @property quotes No description
 * @property about No description
 */
data class UserSettingsInterests(
    val activities: UserSettingsInterest? = null,
    val interests: UserSettingsInterest? = null,
    val music: UserSettingsInterest? = null,
    val tv: UserSettingsInterest? = null,
    val movies: UserSettingsInterest? = null,
    val books: UserSettingsInterest? = null,
    val games: UserSettingsInterest? = null,
    val quotes: UserSettingsInterest? = null,
    val about: UserSettingsInterest? = null
)
