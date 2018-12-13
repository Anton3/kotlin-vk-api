package name.alatushkin.vkapi.methods.callback

import com.fasterxml.jackson.annotation.*
import name.alatushkin.vkapi.generated.audio.objects.AudioFull
import name.alatushkin.vkapi.generated.board.objects.TopicComment
import name.alatushkin.vkapi.generated.common.objects.LikesInfo
import name.alatushkin.vkapi.generated.messages.objects.Message
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.generated.video.objects.VideoImpl
import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.generated.wall.objects.WallComment
import name.alatushkin.vkapi.generated.wall.objects.WallpostFull
import name.alatushkin.vkapi.vktypes.VkDate

@JsonIgnoreProperties(ignoreUnknown = true)
interface Attachment


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
    defaultImpl = NotImplemented::class,
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@JsonSubTypes(
    JsonSubTypes.Type(name = "message_new", value = MessageNew::class),
    JsonSubTypes.Type(name = "message_reply", value = MessageReply::class),
    JsonSubTypes.Type(name = "message_allow", value = MessageAllow::class),
    JsonSubTypes.Type(name = "message_deny", value = MessageDeny::class),

    JsonSubTypes.Type(name = "photo_new", value = PhotoNew::class),

    JsonSubTypes.Type(name = "photo_comment_new", value = PhotoCommentCallbackEvent::class),
    JsonSubTypes.Type(name = "photo_comment_edit", value = PhotoCommentCallbackEvent::class),
    JsonSubTypes.Type(name = "photo_comment_restore", value = PhotoCommentCallbackEvent::class),
    JsonSubTypes.Type(name = "photo_comment_delete", value = PhotoCommentDelete::class),

    JsonSubTypes.Type(name = "audio_new", value = AudioFull::class),

    JsonSubTypes.Type(name = "video_new", value = VideoImpl::class),
    JsonSubTypes.Type(name = "video_comment_new", value = VideoCommentCallbackEvent::class),
    JsonSubTypes.Type(name = "video_comment_edit", value = VideoCommentCallbackEvent::class),
    JsonSubTypes.Type(name = "video_comment_restore", value = VideoCommentCallbackEvent::class),
    JsonSubTypes.Type(name = "video_comment_delete", value = VideoCommentDelete::class),

    JsonSubTypes.Type(name = "wall_post_new", value = WallPostNew::class),
    JsonSubTypes.Type(name = "wall_repost", value = WallRepost::class),

    JsonSubTypes.Type(name = "wall_reply_new", value = WallReplyCallbackEvent::class),
    JsonSubTypes.Type(name = "wall_reply_edit", value = WallReplyCallbackEvent::class),
    JsonSubTypes.Type(name = "wall_reply_restore", value = WallReplyCallbackEvent::class),
    JsonSubTypes.Type(name = "wall_reply_delete", value = WallReplyDelete::class),

    JsonSubTypes.Type(name = "board_post_new", value = BoardPostCallbackEvent::class),
    JsonSubTypes.Type(name = "board_post_edit", value = BoardPostCallbackEvent::class),
    JsonSubTypes.Type(name = "board_post_restore", value = BoardPostCallbackEvent::class),
    JsonSubTypes.Type(name = "board_post_delete", value = BoardPostDelete::class),

    //market*

    JsonSubTypes.Type(name = "group_leave", value = GroupLeave::class),
    JsonSubTypes.Type(name = "group_join", value = GroupJoin::class),


    JsonSubTypes.Type(name = "user_block", value = UserBlock::class),
    JsonSubTypes.Type(name = "poll_vote_new", value = PollVoteNew::class)

    //poll_vote
    //group_*
    //vkpay


)
sealed class CallbackEvent<T>(
    val groupId: Long,
    val attachment: T
) {
    override fun toString(): String {
        return "${this.javaClass.simpleName} id:${this.groupId}  attach:${this.attachment}"
    }
}


class NotImplemented(groupId: Long, @JsonProperty("object") attachment: Map<String, Any>) :
    CallbackEvent<Map<String, Any>>(groupId, attachment)

class MessageNew(groupId: Long, @JsonProperty("object") attachment: Message) :
    CallbackEvent<Message>(groupId, attachment)

class MessageReply(groupId: Long, @JsonProperty("object") attachment: Message) :
    CallbackEvent<Message>(groupId, attachment)

data class ToggleMessageAllowance(val userId: Long, val key: String?)
class MessageAllow(groupId: Long, @JsonProperty("object") attachment: ToggleMessageAllowance) :
    CallbackEvent<ToggleMessageAllowance>(groupId, attachment)

class MessageDeny(groupId: Long, @JsonProperty("object") attachment: ToggleMessageAllowance) :
    CallbackEvent<ToggleMessageAllowance>(groupId, attachment)

class WallReply(
    val postId: Long,
    val postOwnerId: Long,
    override val id: Long,
    override val fromId: Long,
    override val date: VkDate,
    override val text: String,
    override val likes: LikesInfo?,
    override val replyToUser: Long?,
    override val replyToComment: Long?,
    override val attachments: List<CommentAttachment>?,
    override val realOffset: Long?
) : WallComment

class WallReplyCallbackEvent(groupId: Long, @JsonProperty("object") attachment: WallReply) :
    CallbackEvent<WallReply>(groupId, attachment)


class WallReplyDelete(groupId: Long, @JsonProperty("object") attachment: Attachment) :
    CallbackEvent<WallReplyDelete.Attachment>(groupId, attachment) {

    class Attachment(ownerId: Long, id: Int, userId: Long, deleteId: Long, postId: Long)
}

class WallPostNew(groupId: Long, @JsonProperty("object") attachment: WallpostFull) :
    CallbackEvent<WallpostFull>(groupId, attachment)

class WallRepost(groupId: Long, @JsonProperty("object") attachment: WallpostFull) :
    CallbackEvent<WallpostFull>(groupId, attachment)


data class BoardPostEventAttach(
    val topicId: Long,
    val topicOwnerId: Long,
    override val id: Long,
    override val fromId: Long,
    override val date: VkDate,
    override val text: String,
    override val attachments: List<CommentAttachment>?,
    override val realOffset: Long?
) : TopicComment

class BoardPostCallbackEvent(groupId: Long, @JsonProperty("object") attachment: BoardPostEventAttach) :
    CallbackEvent<BoardPostEventAttach>(groupId, attachment)

class BoardPostDelete(groupId: Long, @JsonProperty("object") attachment: Attach) :
    CallbackEvent<BoardPostDelete.Attach>(groupId, attachment) {
    class Attach(val topicId: Long, val topicOwnerId: Long, val id: Int)
}

class PhotoNew(groupId: Long, @JsonProperty("object") attachment: Photo) : CallbackEvent<Photo>(groupId, attachment)

class PhotoCommentAttach(
    val photoId: Long,
    val photoOwnerId: Long,
    override val id: Long,
    override val fromId: Long,
    override val date: VkDate,
    override val text: String,
    override val likes: LikesInfo?,
    override val replyToUser: Long?,
    override val replyToComment: Long?,
    override val attachments: List<CommentAttachment>?,
    override val realOffset: Long?
) : WallComment


class PhotoCommentCallbackEvent(groupId: Long, @JsonProperty("object") attachment: PhotoCommentAttach) :
    CallbackEvent<PhotoCommentAttach>(groupId, attachment)

class PhotoCommentDelete(groupId: Long, @JsonProperty("object") attachment: Attach) :
    CallbackEvent<PhotoCommentDelete.Attach>(groupId, attachment) {
    class Attach(val ownerId: Long, val id: Int, val userId: Long, val deleterId: Long, val photoId: Long)
}

class VideoCommentAttach(
    val videoId: Long,
    val videoOwnerId: Long,
    override val id: Long,
    override val fromId: Long,
    override val date: VkDate,
    override val text: String,
    override val likes: LikesInfo?,
    override val replyToUser: Long?,
    override val replyToComment: Long?,
    override val attachments: List<CommentAttachment>?,
    override val realOffset: Long?
) : WallComment


class VideoCommentCallbackEvent(groupId: Long, @JsonProperty("object") attachment: VideoCommentAttach) :
    CallbackEvent<VideoCommentAttach>(groupId, attachment)

class VideoCommentDelete(groupId: Long, @JsonProperty("object") attachment: Attach) :
    CallbackEvent<VideoCommentDelete.Attach>(groupId, attachment) {
    class Attach(val ownerId: Long, val id: Int, val userId: Long, val deleterId: Long, val videoId: Long)
}

//{"admin_id":271651224,"user_id":302484804,"unblock_date":0,"reason":"other","comment":""}
class UserBlock(groupId: Long, @JsonProperty("object") attachment: Attachment) :
    CallbackEvent<UserBlock.Attachment>(groupId, attachment) {
    class Attachment(adminId: Long, userId: Long, unblockDate: Long, reason: String, comment: String)
}

class PollVoteNew(groupId: Long, @JsonProperty("object") attachment: Attachment) :
    CallbackEvent<PollVoteNew.Attachment>(groupId, attachment) {
    class Attachment(ownerId: Long, userId: Long, pollId: Long, optionId: Long)
}

enum class JoinType(val value: String) {
    JOIN("join"), UNSURE("unsure"), ACCEPTED("accepted"), APPROVED("approved"), REQUEST("request");

    override fun toString() = value

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): JoinType = JoinType.values().find { it.value == value }!!
    }
}


data class GroupJoinAttach(val userId: Long, val joinType: JoinType)
data class GroupLeaveAttach(val userId: Long, val self: Boolean)

class GroupJoin(groupId: Long, @JsonProperty("object") attachment: GroupJoinAttach) :
    CallbackEvent<GroupJoinAttach>(groupId, attachment)

class GroupLeave(groupId: Long, @JsonProperty("object") attachment: GroupLeaveAttach) :
    CallbackEvent<GroupLeaveAttach>(groupId, attachment)
