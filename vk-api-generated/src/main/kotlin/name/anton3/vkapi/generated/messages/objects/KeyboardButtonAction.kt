@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

/**
 * Description of the action, that should be performed on button click
 *
 * @property type Button type
 * @property payload Additional data sent along with message for developer convenience
 * @property label Label for button
 */
data class KeyboardButtonAction(
    val type: KeyboardButtonActionType,
    val payload: String? = null,
    val label: String? = null
)
