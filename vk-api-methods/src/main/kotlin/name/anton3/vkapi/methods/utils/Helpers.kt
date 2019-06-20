package name.anton3.vkapi.methods.utils

import name.anton3.vkapi.generated.audio.objects.Audio
import name.anton3.vkapi.generated.board.objects.TopicComment
import name.anton3.vkapi.generated.docs.objects.Doc
import name.anton3.vkapi.generated.market.objects.MarketItem
import name.anton3.vkapi.generated.messages.methods.MessagesSetActivity
import name.anton3.vkapi.generated.messages.objects.AudioMessage
import name.anton3.vkapi.generated.messages.objects.Message
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.generated.messages.objects.PinnedMessage
import name.anton3.vkapi.generated.newsfeed.objects.ItemWallpost
import name.anton3.vkapi.generated.notifications.objects.Feedback
import name.anton3.vkapi.generated.photos.objects.CommentXtrPid
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.generated.polls.objects.Poll
import name.anton3.vkapi.generated.video.objects.Video
import name.anton3.vkapi.generated.video.objects.VideoFull
import name.anton3.vkapi.generated.wall.objects.*
import name.anton3.vkapi.generated.widgets.objects.WidgetComment
import name.anton3.vkapi.methods.callback.*

private fun attachmentId(type: String, id: Int, ownerId: Int, accessKey: String? = null): String =
    "$type${ownerId}_$id${accessKey?.let { "_$it" }.orEmpty()}"


fun Photo.toAttachmentId() = attachmentId("photo", id, ownerId, accessKey)
fun Photo.fullId() = attachmentId("", id, ownerId, accessKey)

fun VideoFull.toAttachmentId() = attachmentId("video", id!!, ownerId!!, accessKey)
fun VideoFull.fullId() = attachmentId("", id!!, ownerId!!, accessKey)

fun Video.toAttachmentId() = attachmentId("video", id!!, ownerId!!, accessKey)
fun Video.fullId() = attachmentId("", id!!, ownerId!!, accessKey)

fun Audio.toAttachmentId() = attachmentId("audio", id, ownerId, accessKey)
fun Audio.fullId() = attachmentId("", id, ownerId, accessKey)

fun Doc.toAttachmentId() = attachmentId("doc", id, ownerId, accessKey)
fun Doc.fullId() = attachmentId("", id, ownerId, accessKey)

fun Wallpost.toAttachmentId() = attachmentId("wall", id!!, ownerId!!, accessKey)
fun Wallpost.fullId() = attachmentId("", id!!, ownerId!!, accessKey)

fun MarketItem.toAttachmentId() = attachmentId("market", id, ownerId)
fun MarketItem.fullId() = attachmentId("", id, ownerId)

fun Poll.toAttachmentId() = attachmentId("poll", id, ownerId)
fun Poll.fullId() = attachmentId("", id, ownerId)

fun AudioMessage.fullId() = attachmentId("", id, ownerId)


val Feedback.safeAttachments: List<WallPostAttachmentBody> get() = attachments?.map { it.body }.orEmpty()
val ItemWallpost.safeAttachments: List<WallPostAttachmentBody> get() = attachments?.map { it.body }.orEmpty()
val Wallpost.safeAttachments: List<WallPostAttachmentBody> get() = attachments?.map { it.body }.orEmpty()
val WallpostAttached.safeAttachments: List<WallPostAttachmentBody> get() = attachments?.map { it.body }.orEmpty()
val WallpostToId.safeAttachments: List<WallPostAttachmentBody> get() = attachments?.map { it.body }.orEmpty()
val BoardPostEventAttach.safeAttachments: List<CommentAttachmentBody> get() = attachments?.map { it.body }.orEmpty()
val CommentXtrPid.safeAttachments: List<CommentAttachmentBody> get() = attachments?.map { it.body }.orEmpty()
val MarketCommentAttach.safeAttachments: List<CommentAttachmentBody> get() = attachments?.map { it.body }.orEmpty()
val PhotoCommentAttach.safeAttachments: List<CommentAttachmentBody> get() = attachments?.map { it.body }.orEmpty()
val TopicComment.safeAttachments: List<CommentAttachmentBody> get() = attachments?.map { it.body }.orEmpty()
val VideoCommentAttachment.safeAttachments: List<CommentAttachmentBody> get() = attachments?.map { it.body }.orEmpty()
val WallComment.safeAttachments: List<CommentAttachmentBody> get() = attachments?.map { it.body }.orEmpty()
val WallReply.safeAttachments: List<CommentAttachmentBody> get() = attachments?.map { it.body }.orEmpty()
val WidgetComment.safeAttachments: List<CommentAttachmentBody> get() = attachments?.map { it.body }.orEmpty()
val Message.safeAttachments: List<MessageAttachmentBody> get() = attachments?.map { it.body }.orEmpty()
val PinnedMessage.safeAttachments: List<MessageAttachmentBody> get() = attachments?.map { it.body }.orEmpty()


fun typing(groupId: Int?, peerId: Int): MessagesSetActivity {
    return MessagesSetActivity(peerId = peerId, type = "typing", groupId = groupId)
}
