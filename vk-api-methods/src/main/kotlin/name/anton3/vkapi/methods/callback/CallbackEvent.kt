@file:Suppress("unused")

package name.anton3.vkapi.methods.callback

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import name.anton3.vkapi.generated.audio.objects.Audio
import name.anton3.vkapi.generated.board.objects.TopicComment
import name.anton3.vkapi.generated.comment.objects.Thread
import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.generated.messages.objects.Message
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.generated.video.objects.VideoImpl
import name.anton3.vkapi.generated.wall.objects.CommentAttachment
import name.anton3.vkapi.generated.wall.objects.WallComment
import name.anton3.vkapi.generated.wall.objects.WallpostFull
import name.anton3.vkapi.vktypes.ValueEnum
import name.anton3.vkapi.vktypes.VkDate

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
    defaultImpl = NotImplemented::class,
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@JsonSubTypes(
    JsonSubTypes.Type(name = "confirmation", value = CallbackConfirmationRequest::class),

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

    JsonSubTypes.Type(name = "audio_new", value = Audio::class),

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

    JsonSubTypes.Type(name = "market_comment_new", value = MarketCommentCallbackEvent::class),
    JsonSubTypes.Type(name = "market_comment_edit", value = MarketCommentCallbackEvent::class),
    JsonSubTypes.Type(name = "market_comment_restore", value = MarketCommentCallbackEvent::class),
    JsonSubTypes.Type(name = "market_comment_delete", value = MarketCommentDelete::class),

    JsonSubTypes.Type(name = "group_leave", value = GroupLeave::class),
    JsonSubTypes.Type(name = "group_join", value = GroupJoin::class),

    JsonSubTypes.Type(name = "user_block", value = UserBlock::class),
    JsonSubTypes.Type(name = "user_unblock", value = UserUnblock::class),

    JsonSubTypes.Type(name = "poll_vote_new", value = PollVoteNew::class),

    JsonSubTypes.Type(name = "group_officers_edit", value = GroupOfficersEdit::class),
    JsonSubTypes.Type(name = "group_change_settings", value = GroupChangeSettings::class),
    JsonSubTypes.Type(name = "group_change_photo", value = GroupChangePhoto::class),

    JsonSubTypes.Type(name = "vkpay_transaction", value = VkPayTransaction::class)
)
sealed class CallbackEvent<T>(val groupId: Int, val attachment: T, val secret: String?) {
    override fun toString(): String {
        return "${this.javaClass.simpleName}(id=${this.groupId}, attach=${this.attachment})"
    }
}

class NotImplemented(
    groupId: Int,
    @JsonProperty("object") attachment: Map<String, Any>,
    secret: String?
) : CallbackEvent<Map<String, Any>>(groupId, attachment, secret)


class CallbackConfirmationRequest(
    groupId: Int,
    secret: String?
) : CallbackEvent<Nothing?>(groupId, null, secret)


data class MessageWithClientInfo(val message: Message, val clientInfo: ClientInfo)

class MessageNew(
    groupId: Int,
    @JsonProperty("object") attachment: MessageWithClientInfo,
    secret: String?
) : CallbackEvent<MessageWithClientInfo>(groupId, attachment, secret)

class MessageReply(
    groupId: Int,
    @JsonProperty("object") attachment: Message,
    secret: String?
) : CallbackEvent<Message>(groupId, attachment, secret)

class MessageEdit(
    groupId: Int,
    @JsonProperty("object") attachment: Message,
    secret: String?
) : CallbackEvent<Message>(groupId, attachment, secret)

data class ToggleMessageAllowance(val userId: Int, val key: String?)

class MessageAllow(
    groupId: Int,
    @JsonProperty("object") attachment: ToggleMessageAllowance,
    secret: String?
) : CallbackEvent<ToggleMessageAllowance>(groupId, attachment, secret)

class MessageDeny(
    groupId: Int,
    @JsonProperty("object") attachment: ToggleMessageAllowance,
    secret: String?
) : CallbackEvent<ToggleMessageAllowance>(groupId, attachment, secret)


class WallReply(
    val postOwnerId: Int,
    override val id: Int,
    override val fromId: Int,
    override val date: VkDate,
    override val text: String,
    override val likes: LikesInfo?,
    override val replyToUser: Int?,
    override val replyToComment: Int?,
    override val attachments: List<CommentAttachment>?,
    override val realOffset: Int?,
    override val thread: Thread?,
    override val postId: Int,
    override val ownerId: Int?,
    override val parentsStack: List<Int>?,
    override val deleted: Boolean?
) : WallComment

class WallReplyCallbackEvent(
    groupId: Int,
    @JsonProperty("object") attachment: WallReply,
    secret: String?
) : CallbackEvent<WallReply>(groupId, attachment, secret)

class WallReplyDeleteAttachment(val ownerId: Int, val id: Int, val userId: Int, val deleteId: Int, val postId: Int)

class WallReplyDelete(
    groupId: Int,
    @JsonProperty("object") attachment: WallReplyDeleteAttachment,
    secret: String?
) : CallbackEvent<WallReplyDeleteAttachment>(groupId, attachment, secret)

class WallPostNew(
    groupId: Int,
    @JsonProperty("object") attachment: WallpostFull,
    secret: String?
) : CallbackEvent<WallpostFull>(groupId, attachment, secret)

class WallRepost(
    groupId: Int,
    @JsonProperty("object") attachment: WallpostFull,
    secret: String?
) : CallbackEvent<WallpostFull>(groupId, attachment, secret)


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

class BoardPostCallbackEvent(
    groupId: Int,
    @JsonProperty("object") attachment: BoardPostEventAttach,
    secret: String?
) : CallbackEvent<BoardPostEventAttach>(groupId, attachment, secret)

data class BoardPostDeleteAttachment(val topicId: Int, val topicOwnerId: Int, val id: Int)

class BoardPostDelete(
    groupId: Int,
    @JsonProperty("object") attachment: BoardPostDeleteAttachment,
    secret: String?
) : CallbackEvent<BoardPostDeleteAttachment>(groupId, attachment, secret)


class MarketCommentAttach(
    val itemId: Int,
    val marketOwnerId: Int,
    override val id: Int,
    override val fromId: Int,
    override val date: VkDate,
    override val text: String,
    override val likes: LikesInfo?,
    override val replyToUser: Int?,
    override val replyToComment: Int?,
    override val attachments: List<CommentAttachment>?,
    override val realOffset: Int?,
    override val thread: Thread?,
    override val postId: Int?,
    override val ownerId: Int?,
    override val parentsStack: List<Int>?,
    override val deleted: Boolean?
) : WallComment

class MarketCommentCallbackEvent(
    groupId: Int,
    @JsonProperty("object") attachment: MarketCommentAttach,
    secret: String?
) : CallbackEvent<MarketCommentAttach>(groupId, attachment, secret)

data class MarketCommentDeleteAttachment(
    val ownerId: Int,
    val id: Int,
    val userId: Int,
    val deleterId: Int,
    val itemId: Int
)

class MarketCommentDelete(
    groupId: Int,
    @JsonProperty("object") attachment: MarketCommentDeleteAttachment,
    secret: String?
) : CallbackEvent<MarketCommentDeleteAttachment>(groupId, attachment, secret)


class PhotoNew(
    groupId: Int,
    @JsonProperty("object") attachment: Photo,
    secret: String?
) : CallbackEvent<Photo>(groupId, attachment, secret)

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
    override val realOffset: Int?,
    override val thread: Thread?,
    override val postId: Int?,
    override val ownerId: Int?,
    override val parentsStack: List<Int>?,
    override val deleted: Boolean?
) : WallComment

class PhotoCommentCallbackEvent(
    groupId: Int,
    @JsonProperty("object") attachment: PhotoCommentAttach,
    secret: String?
) : CallbackEvent<PhotoCommentAttach>(groupId, attachment, secret)

class PhotoCommentDeleteAttachment(
    val ownerId: Int,
    val id: Int,
    val userId: Int,
    val deleterId: Int,
    val photoId: Int
)

class PhotoCommentDelete(
    groupId: Int,
    @JsonProperty("object") attachment: PhotoCommentDeleteAttachment,
    secret: String?
) : CallbackEvent<PhotoCommentDeleteAttachment>(groupId, attachment, secret)


class VideoCommentAttachment(
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
    override val realOffset: Int?,
    override val thread: Thread?,
    override val postId: Int?,
    override val ownerId: Int?,
    override val parentsStack: List<Int>?,
    override val deleted: Boolean?
) : WallComment

class VideoCommentCallbackEvent(
    groupId: Int,
    @JsonProperty("object") attachment: VideoCommentAttachment,
    secret: String?
) : CallbackEvent<VideoCommentAttachment>(groupId, attachment, secret)

class VideoCommentDeleteAttachment(
    val ownerId: Int,
    val id: Int,
    val userId: Int,
    val deleterId: Int,
    val videoId: Int
)

class VideoCommentDelete(
    groupId: Int,
    @JsonProperty("object") attachment: VideoCommentDeleteAttachment,
    secret: String?
) : CallbackEvent<VideoCommentDeleteAttachment>(groupId, attachment, secret)


class UserBlockAttachment(
    val adminId: Int,
    val userId: Int,
    val unblockDate: Int,
    val reason: String,
    val comment: String
)

class UserBlock(
    groupId: Int,
    @JsonProperty("object") attachment: UserBlockAttachment,
    secret: String?
) : CallbackEvent<UserBlockAttachment>(groupId, attachment, secret)

class UserUnblockAttachment(
    val adminId: Int,
    val userId: Int,
    val byEndDate: Boolean
)

class UserUnblock(
    groupId: Int,
    @JsonProperty("object") attachment: UserUnblockAttachment,
    secret: String?
) : CallbackEvent<UserUnblockAttachment>(groupId, attachment, secret)


class PollVoteNewAttachment(
    val ownerId: Int,
    val userId: Int,
    val pollId: Int,
    val optionId: Int
)

class PollVoteNew(
    groupId: Int,
    @JsonProperty("object") attachment: PollVoteNewAttachment,
    secret: String?
) : CallbackEvent<PollVoteNewAttachment>(groupId, attachment, secret)


enum class JoinType(override val value: String) : ValueEnum<String> {
    JOIN("join"),
    UNSURE("unsure"),
    ACCEPTED("accepted"),
    APPROVED("approved"),
    REQUEST("request")
}


data class GroupJoinAttach(val userId: Int, val joinType: JoinType)
data class GroupLeaveAttach(val userId: Int, val self: Boolean)

class GroupJoin(
    groupId: Int,
    @JsonProperty("object") attachment: GroupJoinAttach,
    secret: String?
) : CallbackEvent<GroupJoinAttach>(groupId, attachment, secret)

class GroupLeave(
    groupId: Int,
    @JsonProperty("object") attachment: GroupLeaveAttach,
    secret: String?
) : CallbackEvent<GroupLeaveAttach>(groupId, attachment, secret)


enum class OfficerType(override val value: Int) : ValueEnum<Int> {
    USER(0),
    MODERATOR(1),
    EDITOR(2),
    ADMIN(3)
}

data class GroupOfficersEditAttachment(
    val adminId: Int,
    val userId: Int,
    val levelOld: OfficerType,
    val levelNew: OfficerType
)

class GroupOfficersEdit(
    groupId: Int,
    @JsonProperty("object") attachment: GroupOfficersEditAttachment,
    secret: String?
) : CallbackEvent<GroupOfficersEditAttachment>(groupId, attachment, secret)


enum class GroupSettingsField(override val value: String) : ValueEnum<String> {
    TITLE("title"),
    DESCRIPTION("description"),
    ACCESS("access"),
    SCREEN_NAME("screen_name"),
    PUBLIC_CATEGORY("public_category"),
    PUBLIC_SUBCATEGORY("public_subcategory"),
    AGE_LIMITS("age_limits"),
    WEBSITE("website"),
    ENABLE_STATUS_DEFAULT("enable_status_default"),
    ENABLE_AUDIO("enable_audio"),
    ENABLE_PHOTO("enable_photo"),
    ENABLE_VIDEO("enable_video"),
    ENABLE_MARKET("enable_market")
}

data class GroupSettingsFieldChange(
    val oldValue: String,
    val newValue: String
)

data class GroupChangeSettingsAttachment(
    val userId: Int,
    val changes: Map<GroupSettingsField, GroupSettingsFieldChange>
)

class GroupChangeSettings(
    groupId: Int,
    @JsonProperty("object") attachment: GroupChangeSettingsAttachment,
    secret: String?
) : CallbackEvent<GroupChangeSettingsAttachment>(groupId, attachment, secret)


data class GroupChangePhotoAttachment(
    val userId: Int,
    val photo: Photo
)

class GroupChangePhoto(
    groupId: Int,
    @JsonProperty("object") attachment: GroupChangePhotoAttachment,
    secret: String?
) : CallbackEvent<GroupChangePhotoAttachment>(groupId, attachment, secret)


data class VkPayTransactionAttachment(
    val fromId: Int,
    val amount: Int,
    val description: String,
    val date: VkDate
)

class VkPayTransaction(
    groupId: Int,
    @JsonProperty("object") attachment: VkPayTransactionAttachment,
    secret: String?
) : CallbackEvent<VkPayTransactionAttachment>(groupId, attachment, secret)
