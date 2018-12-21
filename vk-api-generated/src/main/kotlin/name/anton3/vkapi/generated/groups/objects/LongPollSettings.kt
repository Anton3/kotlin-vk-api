package name.anton3.vkapi.generated.groups.objects

/**
 * No description
 *
 * @property isEnabled Shows whether Long Poll is enabled
 * @property apiVersion API version used for the events
 * @property events No description
 */
data class LongPollSettings(
    val isEnabled: Boolean,
    val apiVersion: String? = null,
    val events: LongPollEvents
)
