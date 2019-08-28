@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

/**
 * No description
 *
 * @property time Last visit date (in Unix time)
 * @property platform Type of the platform that used for the last authorization
 */
data class LastSeen(
    val time: Int? = null,
    val platform: Int? = null
)
