package name.alatushkin.vkapi.json.deser

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import name.alatushkin.vkapi.generated.audio.objects.AudioFull
import name.alatushkin.vkapi.generated.common.objects.Link
import name.alatushkin.vkapi.generated.common.objects.Sticker
import name.alatushkin.vkapi.generated.docs.objects.Doc
import name.alatushkin.vkapi.generated.gifts.objects.Layout
import name.alatushkin.vkapi.generated.market.objects.MarketAlbum
import name.alatushkin.vkapi.generated.market.objects.MarketItem
import name.alatushkin.vkapi.generated.messages.objects.AudioMessage
import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.generated.pages.objects.WikipageFull
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.generated.photos.objects.PhotoAlbum
import name.alatushkin.vkapi.generated.polls.objects.Poll
import name.alatushkin.vkapi.generated.video.objects.Video
import name.alatushkin.vkapi.generated.wall.objects.*
import name.alatushkin.vkapi.json.weakType

internal sealed class AbstractVkAttachmentsDeserializer<T>(
    attachmentsBaseClass: Class<T>,
    private val typeMap: Map<String, Class<out T>>
) : StdDeserializer<T>(attachmentsBaseClass) {

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): T {
        val c = p.codec
        val root = p.readValueAsTree<JsonNode>()
        val typeValue = root["type"].asText()
        return c.treeToValue(root[typeValue], typeMap.getOrElse(typeValue) { error("Unknown $typeValue") })
    }
}

internal object VkWallPostAttachmentsDeserializer : AbstractVkAttachmentsDeserializer<WallpostAttachment>(
    weakType(),
    mapOf(
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
)

internal object VkCommentAttachmentsDeserializer : AbstractVkAttachmentsDeserializer<CommentAttachment>(
    weakType(),
    mapOf(
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
)

internal object VkMessageAttachmentsDeserializer : AbstractVkAttachmentsDeserializer<MessageAttachment>(
    weakType(),
    mapOf(
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
        "audio_message" to AudioMessage::class.java
    )
)
