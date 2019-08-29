package name.anton3.vkapi.json.deserializers

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.jsontype.NamedType
import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.databind.node.TextNode
import com.fasterxml.jackson.databind.ser.std.StdSerializer
import name.anton3.vkapi.generated.audio.objects.AudioFull
import name.anton3.vkapi.generated.common.objects.Link
import name.anton3.vkapi.generated.common.objects.Sticker
import name.anton3.vkapi.generated.docs.objects.Doc
import name.anton3.vkapi.generated.gifts.objects.Layout
import name.anton3.vkapi.generated.market.objects.MarketAlbum
import name.anton3.vkapi.generated.market.objects.MarketItem
import name.anton3.vkapi.generated.messages.objects.AudioMessage
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.generated.messages.objects.MessageGraffiti
import name.anton3.vkapi.generated.pages.objects.WikipageFull
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.generated.photos.objects.PhotoAlbum
import name.anton3.vkapi.generated.polls.objects.Poll
import name.anton3.vkapi.generated.video.objects.Video
import name.anton3.vkapi.generated.wall.objects.*
import name.anton3.vkapi.json.core.readNode
import name.anton3.vkapi.json.core.weakType
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.primaryConstructor


internal val wallPostAttachmentTypes: List<NamedType> = listOf(
    NamedType(Photo::class.java, "photo"),
    NamedType(AudioFull::class.java, "audio"),
    NamedType(Video::class.java, "video"),
    NamedType(Doc::class.java, "doc"),
    NamedType(Link::class.java, "link"),
    NamedType(MarketAlbum::class.java, "market_album"),
    NamedType(MarketItem::class.java, "market"),
    NamedType(AttachedNote::class.java, "note"),
    NamedType(AppPost::class.java, "app"),
    NamedType(Graffiti::class.java, "graffiti"),
    NamedType(Poll::class.java, "poll"),
    NamedType(WikipageFull::class.java, "page"),
    NamedType(PhotoAlbum::class.java, "album"),
    NamedType(WallPostAttachmentBodyPhotosList::class.java, "photos_list"),
    NamedType(PostedPhoto::class.java, "posted_photo")
)

internal val commentAttachmentTypes: List<NamedType> = listOf(
    NamedType(Photo::class.java, "photo"),
    NamedType(AudioFull::class.java, "audio"),
    NamedType(Video::class.java, "video"),
    NamedType(Doc::class.java, "doc"),
    NamedType(Link::class.java, "link"),
    NamedType(MarketAlbum::class.java, "market_album"),
    NamedType(MarketItem::class.java, "market"),
    NamedType(AttachedNote::class.java, "note"),
    NamedType(WikipageFull::class.java, "page"),
    NamedType(Sticker::class.java, "sticker")
)

internal val messageAttachmentTypes: List<NamedType> = listOf(
    NamedType(Photo::class.java, "photo"),
    NamedType(AudioFull::class.java, "audio"),
    NamedType(Video::class.java, "video"),
    NamedType(Doc::class.java, "doc"),
    NamedType(Link::class.java, "link"),
    NamedType(MarketAlbum::class.java, "market_album"),
    NamedType(MarketItem::class.java, "market"),
    NamedType(Layout::class.java, "gift"),
    NamedType(WallpostAttached::class.java, "wall"),
    NamedType(WallComment::class.java, "wall_reply"),
    NamedType(AudioMessage::class.java, "audio_message"),
    NamedType(MessageGraffiti::class.java, "graffiti"),
    NamedType(Poll::class.java, "poll"),
    NamedType(Sticker::class.java, "sticker")
)


class UnknownCallbackAttachment @JsonCreator(mode = JsonCreator.Mode.DELEGATING) constructor(
    @Suppress("unused")
    @JsonValue
    val contents: ObjectNode
) : WallPostAttachmentBody, CommentAttachmentBody, MessageAttachmentBody


internal inline fun <reified Attachment : Any, reified Body : Any> attachmentDeserializer(attachmentTypes: List<NamedType>): StdDeserializer<Attachment> {
    val constructor = Attachment::class.primaryConstructor!!
    val typeToClass = attachmentTypes.associate { it.name!! to it.type!! }

    return object : StdDeserializer<Attachment>(weakType<Attachment>()) {
        override fun deserialize(p: JsonParser, ctxt: DeserializationContext): Attachment {
            val codec = p.codec as ObjectMapper
            val node = p.readNode<ObjectNode>()

            val type = node["type"]?.asText() ?: error("No `type` field")
            val bodyNode = node[type] as ObjectNode

            val klass = typeToClass[type]

            val body = if (klass != null) {
                codec.treeToValue(bodyNode, klass)
            } else {
                UnknownCallbackAttachment(bodyNode)
            }

            return constructor.call(type, body as Body)
        }
    }
}

internal inline fun <reified Attachment : Any, reified Body : Any> attachmentSerializer(): StdSerializer<Attachment> {
    val typeProperty = Attachment::class.memberProperties.first { it.name == "type" }
    val bodyProperty = Attachment::class.memberProperties.first { it.name == "body" }

    return object : StdSerializer<Attachment>(weakType<Attachment>()) {
        override fun serialize(value: Attachment, gen: JsonGenerator, provider: SerializerProvider) {
            val codec = gen.codec as ObjectMapper

            val type = typeProperty.get(value) as String
            val body = bodyProperty.get(value) as Body

            val bodyNode = codec.valueToTree<ObjectNode>(body)

            val resultNode = ObjectNode(codec.nodeFactory, mapOf("type" to TextNode(type), type to bodyNode))
            return codec.writeTree(gen, resultNode)
        }
    }
}
