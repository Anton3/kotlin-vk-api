package name.anton3.vkapi.generated.messages.objects

/**
 * No description
 *
 * @property authorId Community or bot, which set this keyboard
 * @property oneTime Should this keyboard disappear on first use
 * @property buttons No description
 */
data class KeyboardReturned(
    val authorId: Long,
    override val oneTime: Boolean,
    override val buttons: List<List<KeyboardButton>>
) : Keyboard
