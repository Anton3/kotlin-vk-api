package name.anton3.vkapi.methods.utils

import name.anton3.vkapi.client.VkClient
import name.anton3.vkapi.client.invoke
import name.anton3.vkapi.generated.audio.objects.Audio
import name.anton3.vkapi.generated.docs.objects.Doc
import name.anton3.vkapi.generated.market.objects.MarketItem
import name.anton3.vkapi.generated.messages.methods.MessagesSetActivity
import name.anton3.vkapi.generated.messages.objects.AudioMessage
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.generated.polls.objects.Poll
import name.anton3.vkapi.generated.video.objects.Video
import name.anton3.vkapi.generated.video.objects.VideoFull
import name.anton3.vkapi.generated.wall.objects.Wallpost
import name.anton3.vkapi.tokens.UserGroupMethod

private fun attachmentId(type: String, id: Long, ownerId: Long, accessKey: String? = null): String =
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

suspend fun VkClient<UserGroupMethod>.sendTypings(groupId: Long, peerId: Long) {
    this(
        MessagesSetActivity(
            peerId = peerId,
            type = "typing",
            groupId = groupId
        )
    )
}
