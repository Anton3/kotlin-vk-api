package name.alatushkin.vkapi.generated.messages.objects

/**
 * No description
 *
 * @property key Key
 * @property server Server URL
 * @property ts Timestamp
 * @property pts Persistent timestamp
 */
data class LongpollParams(
    val key: String? = null,
    val server: String? = null,
    val ts: Long? = null,
    val pts: Long? = null
)
