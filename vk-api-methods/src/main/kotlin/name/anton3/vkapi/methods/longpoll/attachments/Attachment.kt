package name.anton3.vkapi.methods.longpoll.attachments

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
    defaultImpl = GenericAttachment::class,
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(name = "link", value = LinkAttachment::class),
    JsonSubTypes.Type(name = "doc", value = DocAttachment::class),
    JsonSubTypes.Type(name = "sticker", value = StickerAttachment::class)
)
open class Attachment(open val type: AttachmentType, open val id: String)
