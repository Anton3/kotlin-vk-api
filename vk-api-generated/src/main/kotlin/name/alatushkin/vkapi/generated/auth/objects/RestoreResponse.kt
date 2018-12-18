package name.anton3.vkapi.generated.auth.objects

import name.anton3.vkapi.generated.auth.responses.RestoreResponseSuccess

/**
 * No description
 *
 * @property success 1 if success
 * @property sid Parameter needed to grant access by code
 */
data class RestoreResponse(
    val success: RestoreResponseSuccess? = null,
    val sid: String? = null
)
