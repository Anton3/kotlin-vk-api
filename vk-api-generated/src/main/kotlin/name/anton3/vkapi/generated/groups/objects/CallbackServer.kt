@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

/**
 * No description
 *
 * @property id No description
 * @property title No description
 * @property creatorId No description
 * @property url No description
 * @property secretKey No description
 * @property status No description
 */
data class CallbackServer(
    val id: Int,
    val title: String,
    val creatorId: Int,
    val url: String,
    val secretKey: String,
    val status: CallbackServerStatus
)
