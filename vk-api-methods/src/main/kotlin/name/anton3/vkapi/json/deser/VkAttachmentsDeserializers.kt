package name.anton3.vkapi.json.deser

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer
import name.anton3.vkapi.generated.audio.objects.AudioFull
import name.anton3.vkapi.generated.common.objects.Link
import name.anton3.vkapi.generated.common.objects.Sticker
import name.anton3.vkapi.generated.docs.objects.Doc
import name.anton3.vkapi.generated.gifts.objects.Layout
import name.anton3.vkapi.generated.market.objects.MarketAlbum
import name.anton3.vkapi.generated.market.objects.MarketItem
import name.anton3.vkapi.generated.messages.objects.AudioMessage
import name.anton3.vkapi.generated.messages.objects.MessageAttachment
import name.anton3.vkapi.generated.messages.objects.MessageGraffiti
import name.anton3.vkapi.generated.pages.objects.WikipageFull
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.generated.photos.objects.PhotoAlbum
import name.anton3.vkapi.generated.polls.objects.Poll
import name.anton3.vkapi.generated.video.objects.Video
import name.anton3.vkapi.generated.wall.objects.*
import name.anton3.vkapi.json.weakType

private val wallPostAttachmentTypes = listOf(
    "photo" to Photo::class.java,
    "posted_photo" to PostedPhoto::class.java,
    "audio" to AudioFull::class.java,
    "video" to Video::class.java,
    "doc" to Doc::class.java,
    "app" to AppPost::class.java,
    "link" to Link::class.java,
    "graffiti" to Graffiti::class.java,
    "note" to AttachedNote::class.java,
    "poll" to Poll::class.java,
    "page" to WikipageFull::class.java,
    "album" to PhotoAlbum::class.java,
    "photos_list" to WallpostAttachmentPhotosList::class.java,
    "market_market_album" to MarketAlbum::class.java,
    "market" to MarketItem::class.java
)

private val commentAttachmentTypes = listOf(
    "photo" to Photo::class.java,
    "audio" to AudioFull::class.java,
    "video" to Video::class.java,
    "doc" to Doc::class.java,
    "link" to Link::class.java,
    "note" to AttachedNote::class.java,
    "page" to WikipageFull::class.java,
    "market_market_album" to MarketAlbum::class.java,
    "market" to MarketItem::class.java,
    "sticker" to Sticker::class.java
)

private val messageAttachmentTypes = listOf(
    "photo" to Photo::class.java,
    "audio" to AudioFull::class.java,
    "video" to Video::class.java,
    "doc" to Doc::class.java,
    "link" to Link::class.java,
    "market_market_album" to MarketAlbum::class.java,
    "market" to MarketItem::class.java,
    "sticker" to Sticker::class.java,
    "gift" to Layout::class.java,
    "wall" to WallpostAttached::class.java,
    "wall_reply" to WallComment::class.java,
    "audio_message" to AudioMessage::class.java,
    "graffiti" to MessageGraffiti::class.java,
    "poll" to Poll::class.java
)


internal sealed class AbstractVkAttachmentsDeserializer<T: Any>(
    attachmentsBaseClass: Class<T>,
    types: List<Pair<String, Class<out T>>>
) : StdDeserializer<T>(attachmentsBaseClass) {

    private val typeMap = types.toMap()

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): T {
        val c = p.codec
        val root = p.readValueAsTree<JsonNode>()
        val attachmentType = root["type"].asText()
        val attachmentClass = typeMap.getOrElse(attachmentType) { error("Unknown attachment type $attachmentType") }
        return c.treeToValue(root[attachmentType], attachmentClass)
    }
}

internal object VkWallPostAttachmentsDeserializer :
    AbstractVkAttachmentsDeserializer<WallpostAttachment>(weakType(), wallPostAttachmentTypes)

internal object VkCommentAttachmentsDeserializer :
    AbstractVkAttachmentsDeserializer<CommentAttachment>(weakType(), commentAttachmentTypes)

internal object VkMessageAttachmentsDeserializer :
    AbstractVkAttachmentsDeserializer<MessageAttachment>(weakType(), messageAttachmentTypes)


internal sealed class AbstractVkAttachmentsSerializer<T: Any>(
    attachmentsBaseClass: Class<T>,
    types: List<Pair<String, Class<out T>>>
) : StdSerializer<T>(attachmentsBaseClass) {

    private val typeMap = types.associate { it.second to it.first }

    override fun serialize(value: T, gen: JsonGenerator, provider: SerializerProvider) {
        val attachmentClass = value::class.java
        val attachmentType = typeMap[attachmentClass] ?: error("Unknown attachment class ${attachmentClass.canonicalName}")
        gen.writeStartObject()
        gen.writeStringField("type", attachmentType)
        gen.writeObjectField(attachmentType, value)
        gen.writeEndObject()
    }
}

internal object VkWallPostAttachmentsSerializer :
    AbstractVkAttachmentsSerializer<WallpostAttachment>(weakType(), wallPostAttachmentTypes)

internal object VkCommentAttachmentsSerializer :
    AbstractVkAttachmentsSerializer<CommentAttachment>(weakType(), commentAttachmentTypes)

internal object VkMessageAttachmentsSerializer :
    AbstractVkAttachmentsSerializer<MessageAttachment>(weakType(), messageAttachmentTypes)
