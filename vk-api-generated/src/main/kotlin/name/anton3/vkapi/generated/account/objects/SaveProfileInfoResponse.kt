package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property changed 1 if changes has been processed
 * @property nameRequest No description
 */
data class SaveProfileInfoResponse(
    val changed: BoolInt? = null,
    val nameRequest: NameRequest? = null
)
