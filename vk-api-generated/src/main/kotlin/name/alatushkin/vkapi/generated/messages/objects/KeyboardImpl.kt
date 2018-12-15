package name.alatushkin.vkapi.generated.messages.objects

/**
 * No description
 *
 * @property oneTime Should this keyboard disappear on first use
 * @property buttons No description
 */
data class KeyboardImpl(
    override val oneTime: Boolean,
    override val buttons: List<List<KeyboardButton>>
) : Keyboard
