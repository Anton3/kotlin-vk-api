package name.anton3.vkapi.methods.longpoll.attachments

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
    defaultImpl = UnknownAttachment::class,
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(name = "photo", value = PhotoAttachment::class),
    JsonSubTypes.Type(name = "video", value = VideoAttachment::class),
    JsonSubTypes.Type(name = "audio", value = AudioAttachment::class),
    JsonSubTypes.Type(name = "doc", value = DocAttachment::class),
    JsonSubTypes.Type(name = "wall", value = WallAttachment::class),
    JsonSubTypes.Type(name = "sticker", value = StickerAttachment::class),
    JsonSubTypes.Type(name = "link", value = LinkAttachment::class)
)
open class Attachment(open val type: String, open val id: String?)
