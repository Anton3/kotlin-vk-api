package name.anton3.vkapi.methods.longpoll.attachments

data class StickerAttachment(
    override val type: String,
    override val id: String,
    val productId: String
) : Attachment(type, id)
