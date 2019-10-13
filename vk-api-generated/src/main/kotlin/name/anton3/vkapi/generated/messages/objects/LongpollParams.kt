@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

/**
 * No description
 *
 * @property key Key
 * @property pts Persistent timestamp
 * @property server Server URL
 * @property ts Timestamp
 */
data class LongpollParams(
    val key: String? = null,
    val pts: Int? = null,
    val server: String? = null,
    val ts: Int? = null
)
