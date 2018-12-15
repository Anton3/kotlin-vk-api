package name.alatushkin.vkapi.generated.auth.objects

import name.alatushkin.vkapi.generated.auth.responses.ConfirmResponseSuccess

/**
 * No description
 *
 * @property success 1 if success
 * @property userId User ID
 */
data class ConfirmResponse(
    val success: ConfirmResponseSuccess? = null,
    val userId: Long? = null
)
