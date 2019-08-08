package name.anton3.vkapi.methods.longpoll.attachments

data class GenericAttachment(
    override val type: AttachmentType,
    override val id: String
) : Attachment(type, id)
