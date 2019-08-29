package name.anton3.vkapi.methods.longpoll.attachments

data class UnknownAttachment(
    override val type: String,
    override val id: String
) : Attachment(type, id)
