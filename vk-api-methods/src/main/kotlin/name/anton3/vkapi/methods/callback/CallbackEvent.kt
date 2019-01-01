@file:Suppress("unused")

package name.anton3.vkapi.methods.callback

import com.fasterxml.jackson.annotation.*
import name.anton3.vkapi.generated.audio.objects.AudioFull
import name.anton3.vkapi.generated.board.objects.TopicComment
import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.generated.messages.objects.Message
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.generated.video.objects.VideoImpl
import name.anton3.vkapi.generated.wall.objects.CommentAttachment
import name.anton3.vkapi.generated.wall.objects.WallComment
import name.anton3.vkapi.generated.wall.objects.WallpostFull
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.VkDate
import name.anton3.vkapi.vktypes.parseEnum

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
    JsonSubTypes.Type(name = "message_edit", value = MessageEdit::class),
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

    // TODO market*

    JsonSubTypes.Type(name = "group_leave", value = GroupLeave::class),
    JsonSubTypes.Type(name = "group_join", value = GroupJoin::class),


    JsonSubTypes.Type(name = "user_block", value = UserBlock::class),
    JsonSubTypes.Type(name = "poll_vote_new", value = PollVoteNew::class)

    // TODO poll_vote
    // TODO group_*
    // TODO vkpay
)
sealed class CallbackEvent<T>(
    val groupId: Int,
    val attachment: T
) {
    override fun toString(): String {
        return "${this.javaClass.simpleName}(id=${this.groupId}, attach=${this.attachment})"
    }
}


class NotImplemented(groupId: Int, @JsonProperty("object") attachment: Map<String, Any>) :
    CallbackEvent<Map<String, Any>>(groupId, attachment)

class MessageNew(groupId: Int, @JsonProperty("object") attachment: Message) :
    CallbackEvent<Message>(groupId, attachment)

class MessageReply(groupId: Int, @JsonProperty("object") attachment: Message) :
    CallbackEvent<Message>(groupId, attachment)

class MessageEdit(groupId: Int, @JsonProperty("object") attachment: Message) :
    CallbackEvent<Message>(groupId, attachment)

data class ToggleMessageAllowance(val userId: Int, val key: String?)

class MessageAllow(groupId: Int, @JsonProperty("object") attachment: ToggleMessageAllowance) :
    CallbackEvent<ToggleMessageAllowance>(groupId, attachment)

class MessageDeny(groupId: Int, @JsonProperty("object") attachment: ToggleMessageAllowance) :
    CallbackEvent<ToggleMessageAllowance>(groupId, attachment)

class WallReply(
    val postId: Int,
    val postOwnerId: Int,
    override val id: Int,
    override val fromId: Int,
    override val date: VkDate,
    override val text: String,
    override val likes: LikesInfo?,
    override val replyToUser: Int?,
    override val replyToComment: Int?,
    override val attachments: List<CommentAttachment>?,
    override val realOffset: Int?
) : WallComment

class WallReplyCallbackEvent(groupId: Int, @JsonProperty("object") attachment: WallReply) :
    CallbackEvent<WallReply>(groupId, attachment)


class WallReplyDelete(groupId: Int, @JsonProperty("object") attachment: Attachment) :
    CallbackEvent<WallReplyDelete.Attachment>(groupId, attachment) {

    class Attachment(val ownerId: Int, val id: Int, val userId: Int, val deleteId: Int, val postId: Int)
}

class WallPostNew(groupId: Int, @JsonProperty("object") attachment: WallpostFull) :
    CallbackEvent<WallpostFull>(groupId, attachment)

class WallRepost(groupId: Int, @JsonProperty("object") attachment: WallpostFull) :
    CallbackEvent<WallpostFull>(groupId, attachment)


data class BoardPostEventAttach(
    val topicId: Int,
    val topicOwnerId: Int,
    override val id: Int,
    override val fromId: Int,
    override val date: VkDate,
    override val text: String,
    override val attachments: List<CommentAttachment>?,
    override val realOffset: Int?
) : TopicComment

class BoardPostCallbackEvent(groupId: Int, @JsonProperty("object") attachment: BoardPostEventAttach) :
    CallbackEvent<BoardPostEventAttach>(groupId, attachment)

class BoardPostDelete(groupId: Int, @JsonProperty("object") attachment: Attach) :
    CallbackEvent<BoardPostDelete.Attach>(groupId, attachment) {
    class Attach(val topicId: Int, val topicOwnerId: Int, val id: Int)
}

class PhotoNew(groupId: Int, @JsonProperty("object") attachment: Photo) : CallbackEvent<Photo>(groupId, attachment)

class PhotoCommentAttach(
    val photoId: Int,
    val photoOwnerId: Int,
    override val id: Int,
    override val fromId: Int,
    override val date: VkDate,
    override val text: String,
    override val likes: LikesInfo?,
    override val replyToUser: Int?,
    override val replyToComment: Int?,
    override val attachments: List<CommentAttachment>?,
    override val realOffset: Int?
) : WallComment


class PhotoCommentCallbackEvent(groupId: Int, @JsonProperty("object") attachment: PhotoCommentAttach) :
    CallbackEvent<PhotoCommentAttach>(groupId, attachment)

class PhotoCommentDelete(groupId: Int, @JsonProperty("object") attachment: Attach) :
    CallbackEvent<PhotoCommentDelete.Attach>(groupId, attachment) {
    class Attach(val ownerId: Int, val id: Int, val userId: Int, val deleterId: Int, val photoId: Int)
}

class VideoCommentAttach(
    val videoId: Int,
    val videoOwnerId: Int,
    override val id: Int,
    override val fromId: Int,
    override val date: VkDate,
    override val text: String,
    override val likes: LikesInfo?,
    override val replyToUser: Int?,
    override val replyToComment: Int?,
    override val attachments: List<CommentAttachment>?,
    override val realOffset: Int?
) : WallComment


class VideoCommentCallbackEvent(groupId: Int, @JsonProperty("object") attachment: VideoCommentAttach) :
    CallbackEvent<VideoCommentAttach>(groupId, attachment)

class VideoCommentDelete(groupId: Int, @JsonProperty("object") attachment: Attach) :
    CallbackEvent<VideoCommentDelete.Attach>(groupId, attachment) {
    class Attach(val ownerId: Int, val id: Int, val userId: Int, val deleterId: Int, val videoId: Int)
}

//{"admin_id":271651224,"user_id":302484804,"unblock_date":0,"reason":"other","comment":""}
class UserBlock(groupId: Int, @JsonProperty("object") attachment: Attachment) :
    CallbackEvent<UserBlock.Attachment>(groupId, attachment) {

    class Attachment(
        val adminId: Int,
        val userId: Int,
        val unblockDate: Int,
        val reason: String,
        val comment: String
    )
}

class PollVoteNew(groupId: Int, @JsonProperty("object") attachment: Attachment) :
    CallbackEvent<PollVoteNew.Attachment>(groupId, attachment) {

    class Attachment(val ownerId: Int, val userId: Int, val pollId: Int, val optionId: Int)
}

enum class JoinType(@JsonValue override val value: String) : Value<String> {
    JOIN("join"),
    UNSURE("unsure"),
    ACCEPTED("accepted"),
    APPROVED("approved"),
    REQUEST("request");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): JoinType = parseEnum(value)
    }
}


data class GroupJoinAttach(val userId: Int, val joinType: JoinType)
data class GroupLeaveAttach(val userId: Int, val self: Boolean)

class GroupJoin(groupId: Int, @JsonProperty("object") attachment: GroupJoinAttach) :
    CallbackEvent<GroupJoinAttach>(groupId, attachment)

class GroupLeave(groupId: Int, @JsonProperty("object") attachment: GroupLeaveAttach) :
    CallbackEvent<GroupLeaveAttach>(groupId, attachment)
