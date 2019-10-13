@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.status.objects

import name.anton3.vkapi.generated.audio.objects.Audio

/**
 * No description
 *
 * @property audio No description
 * @property text Status text
 */
data class Status(
    val audio: Audio? = null,
    val text: String? = null
)
