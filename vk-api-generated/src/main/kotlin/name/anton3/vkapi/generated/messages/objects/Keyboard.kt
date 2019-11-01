@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * Keyboard attached to a message
 *
 * @property oneTime Should this keyboard disappear on first use
 * @property buttons No description
 */
@JsonDeserialize(`as` = KeyboardImpl::class)
interface Keyboard {
    val oneTime: Boolean
    val buttons: List<List<KeyboardButton>>
}
