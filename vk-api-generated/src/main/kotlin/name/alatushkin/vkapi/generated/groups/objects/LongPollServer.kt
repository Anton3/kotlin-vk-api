package name.anton3.vkapi.generated.groups.objects

/**
 * No description
 *
 * @property key Long Poll key
 * @property server Long Poll server address
 * @property ts Number of the last event
 */
data class LongPollServer(
    val key: String,
    val server: String,
    val ts: Long
)
