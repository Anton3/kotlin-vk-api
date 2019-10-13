@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

/**
 * No description
 *
 * @property skype User's Skype nickname
 * @property facebook User's Facebook account
 * @property facebookName User's Facebook name
 * @property twitter User's Twitter account
 * @property livejournal User's Livejournal account
 * @property instagram User's Instagram account
 */
data class UserConnections(
    val skype: String,
    val facebook: String,
    val facebookName: String? = null,
    val twitter: String,
    val livejournal: String? = null,
    val instagram: String
)
