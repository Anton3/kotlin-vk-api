package name.alatushkin.vkapi.vktypes

import name.alatushkin.vkapi.client.VkClient
import name.alatushkin.vkapi.client.invoke
import name.alatushkin.vkapi.generated.audio.objects.Audio
import name.alatushkin.vkapi.generated.docs.objects.Doc
import name.alatushkin.vkapi.generated.market.objects.MarketItem
import name.alatushkin.vkapi.generated.messages.methods.MessagesSetActivity
import name.alatushkin.vkapi.generated.messages.objects.AudioMessage
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.generated.polls.objects.Poll
import name.alatushkin.vkapi.generated.video.objects.Video
import name.alatushkin.vkapi.generated.video.objects.VideoFull
import name.alatushkin.vkapi.generated.wall.objects.Wallpost
import name.alatushkin.vkapi.tokens.UserGroupMethod

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
