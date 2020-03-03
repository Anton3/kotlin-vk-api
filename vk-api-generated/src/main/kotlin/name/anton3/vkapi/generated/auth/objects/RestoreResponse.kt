@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.auth.objects

import name.anton3.vkapi.vktypes.PropertyExists

/**
 * No description
 *
 * @property success 1 if success
 * @property sid Parameter needed to grant access by code
 */
data class RestoreResponse(
    val success: PropertyExists? = null,
    val sid: String? = null
)
