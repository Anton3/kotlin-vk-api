package name.anton3.vkapi.json.deserializers

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.jsontype.NamedType
import com.fasterxml.jackson.databind.node.ObjectNode
import name.anton3.vkapi.generated.audio.objects.Audio
import name.anton3.vkapi.generated.common.objects.Link
import name.anton3.vkapi.generated.common.objects.Sticker
import name.anton3.vkapi.generated.docs.objects.Doc
import name.anton3.vkapi.generated.docs.objects.SaveDocBody
import name.anton3.vkapi.generated.gifts.objects.Layout
import name.anton3.vkapi.generated.market.objects.MarketAlbum
import name.anton3.vkapi.generated.market.objects.MarketItem
import name.anton3.vkapi.generated.messages.objects.AudioMessage
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.generated.pages.objects.WikipageFull
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.generated.photos.objects.PhotoAlbum
import name.anton3.vkapi.generated.polls.objects.Poll
import name.anton3.vkapi.generated.video.objects.Video
import name.anton3.vkapi.generated.wall.objects.*
import name.anton3.vkapi.generated.messages.objects.Graffiti as MessageGraffiti
import name.anton3.vkapi.generated.wall.objects.Graffiti as WallGraffiti

internal val wallPostAttachmentTypes: List<NamedType> = listOf(
    NamedType(Photo::class.java, "photo"),
    NamedType(Audio::class.java, "audio"),
    NamedType(Video::class.java, "video"),
    NamedType(Doc::class.java, "doc"),
    NamedType(Link::class.java, "link"),
    NamedType(MarketAlbum::class.java, "market_album"),
    NamedType(MarketItem::class.java, "market"),
    NamedType(AttachedNote::class.java, "note"),
    NamedType(AppPost::class.java, "app"),
    NamedType(WallGraffiti::class.java, "graffiti"),
    NamedType(Poll::class.java, "poll"),
    NamedType(WikipageFull::class.java, "page"),
    NamedType(PhotoAlbum::class.java, "album"),
    NamedType(WallPostAttachmentBodyPhotosList::class.java, "photos_list"),
    NamedType(PostedPhoto::class.java, "posted_photo")
)

internal val commentAttachmentTypes: List<NamedType> = listOf(
    NamedType(Photo::class.java, "photo"),
    NamedType(Audio::class.java, "audio"),
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
    NamedType(Audio::class.java, "audio"),
    NamedType(Video::class.java, "video"),
    NamedType(Doc::class.java, "doc"),
    NamedType(Link::class.java, "link"),
    NamedType(MarketAlbum::class.java, "market_album"),
    NamedType(MarketItem::class.java, "market"),
    NamedType(Layout::class.java, "gift"),
    NamedType(WallpostToId::class.java, "wall"),
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
) : WallPostAttachmentBody, CommentAttachmentBody, MessageAttachmentBody, SaveDocBody
