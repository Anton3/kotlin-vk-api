package name.anton3.vkapi.methods.longpoll.attachments

class AudioAttachment(
    override val type: String,
    override val id: String
) : Attachment(type, id)
