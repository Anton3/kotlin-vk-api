@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * Keyboard attached to a message
 *
 * @property oneTime Should this keyboard disappear on first use
 * @property buttons No description
 */
@JsonDeserialize(`as` = Void::class)
data class KeyboardImpl(
    override val oneTime: Boolean,
    override val buttons: List<List<KeyboardButton>>
) : Keyboard
