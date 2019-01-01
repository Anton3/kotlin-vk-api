package name.anton3.vkapi.generated.auth.objects

import name.anton3.vkapi.generated.auth.responses.ConfirmResponseSuccess

/**
 * No description
 *
 * @property success 1 if success
 * @property userId User ID
 */
data class ConfirmResponse(
    val success: ConfirmResponseSuccess? = null,
    val userId: Int? = null
)
