package name.alatushkin.vkapi.generated.messages.objects

data class KeyboardImpl(
    override val oneTime: Boolean,
    override val buttons: List<List<KeyboardButton>>
) : Keyboard
