package name.alatushkin.api.vk.generated.messages.objects

data class KeyboardReturned(
    val authorId: Long,
    override val oneTime: Boolean,
    override val buttons: List<List<KeyboardButton>>
) : Keyboard
