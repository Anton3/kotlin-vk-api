package name.alatushkin.vkapi.generated.groups.objects

/**
 * No description
 *
 * @property messageNew No description
 * @property messageReply No description
 * @property photoNew No description
 * @property audioNew No description
 * @property videoNew No description
 * @property wallReplyNew No description
 * @property wallReplyEdit No description
 * @property wallReplyDelete No description
 * @property wallReplyRestore No description
 * @property wallPostNew No description
 * @property boardPostNew No description
 * @property boardPostEdit No description
 * @property boardPostRestore No description
 * @property boardPostDelete No description
 * @property photoCommentNew No description
 * @property photoCommentEdit No description
 * @property photoCommentDelete No description
 * @property photoCommentRestore No description
 * @property videoCommentNew No description
 * @property videoCommentEdit No description
 * @property videoCommentDelete No description
 * @property videoCommentRestore No description
 * @property marketCommentNew No description
 * @property marketCommentEdit No description
 * @property marketCommentDelete No description
 * @property marketCommentRestore No description
 * @property pollVoteNew No description
 * @property groupJoin No description
 * @property groupLeave No description
 * @property groupChangeSettings No description
 * @property groupChangePhoto No description
 * @property groupOfficersEdit No description
 * @property messageAllow No description
 * @property messageDeny No description
 * @property wallRepost No description
 * @property userBlock No description
 * @property userUnblock No description
 * @property messagesEdit No description
 * @property messageTypingState No description
 * @property leadFormsNew No description
 */
data class LongPollEvents(
    val messageNew: Boolean,
    val messageReply: Boolean,
    val photoNew: Boolean,
    val audioNew: Boolean,
    val videoNew: Boolean,
    val wallReplyNew: Boolean,
    val wallReplyEdit: Boolean,
    val wallReplyDelete: Boolean,
    val wallReplyRestore: Boolean,
    val wallPostNew: Boolean,
    val boardPostNew: Boolean,
    val boardPostEdit: Boolean,
    val boardPostRestore: Boolean,
    val boardPostDelete: Boolean,
    val photoCommentNew: Boolean,
    val photoCommentEdit: Boolean,
    val photoCommentDelete: Boolean,
    val photoCommentRestore: Boolean,
    val videoCommentNew: Boolean,
    val videoCommentEdit: Boolean,
    val videoCommentDelete: Boolean,
    val videoCommentRestore: Boolean,
    val marketCommentNew: Boolean,
    val marketCommentEdit: Boolean,
    val marketCommentDelete: Boolean,
    val marketCommentRestore: Boolean,
    val pollVoteNew: Boolean,
    val groupJoin: Boolean,
    val groupLeave: Boolean,
    val groupChangeSettings: Boolean,
    val groupChangePhoto: Boolean,
    val groupOfficersEdit: Boolean,
    val messageAllow: Boolean,
    val messageDeny: Boolean,
    val wallRepost: Boolean,
    val userBlock: Boolean,
    val userUnblock: Boolean,
    val messagesEdit: Boolean,
    val messageTypingState: Boolean,
    val leadFormsNew: Boolean? = null
)
