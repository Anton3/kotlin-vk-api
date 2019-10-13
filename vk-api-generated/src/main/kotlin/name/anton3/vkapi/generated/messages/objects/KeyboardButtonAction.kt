@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

/**
 * Description of the action, that should be performed on button click
 *
 * @property appId Fragment value in app link like vk.com/app{app_id}_-654321#hash
 * @property hash Fragment value in app link like vk.com/app123456_-654321#{hash}
 * @property label Label for button
 * @property ownerId Fragment value in app link like vk.com/app123456_{owner_id}#hash
 * @property payload Additional data sent along with message for developer convenience
 * @property type Button type
 */
data class KeyboardButtonAction(
    val appId: Int? = null,
    val hash: String? = null,
    val label: String? = null,
    val ownerId: Int? = null,
    val payload: String? = null,
    val type: KeyboardButtonActionType
)
