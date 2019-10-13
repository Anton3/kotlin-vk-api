@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

/**
 * No description
 *
 * @property apiVersion API version used for the events
 * @property events No description
 * @property isEnabled Shows whether Long Poll is enabled
 */
data class LongPollSettings(
    val apiVersion: String? = null,
    val events: LongPollEvents,
    val isEnabled: Boolean
)
