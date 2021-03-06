package name.anton3.vkapi.methods.longpoll.attachments

data class DocAttachment(
    override val type: String,
    override val id: String,
    val kind: String?
) : Attachment(type, id)
