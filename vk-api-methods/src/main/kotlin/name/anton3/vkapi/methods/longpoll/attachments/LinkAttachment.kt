package name.anton3.vkapi.methods.longpoll.attachments

data class LinkAttachment(
    override val type: AttachmentType,
    override val id: String?,
    val photo: String?,
    val title: String?,
    val description: String?,
    val url: String
) : Attachment(type, id)
