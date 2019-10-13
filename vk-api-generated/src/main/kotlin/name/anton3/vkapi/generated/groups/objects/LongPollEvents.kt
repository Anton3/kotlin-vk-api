@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property audioNew No description
 * @property boardPostDelete No description
 * @property boardPostEdit No description
 * @property boardPostNew No description
 * @property boardPostRestore No description
 * @property groupChangePhoto No description
 * @property groupChangeSettings No description
 * @property groupJoin No description
 * @property groupLeave No description
 * @property groupOfficersEdit No description
 * @property leadFormsNew No description
 * @property marketCommentDelete No description
 * @property marketCommentEdit No description
 * @property marketCommentNew No description
 * @property marketCommentRestore No description
 * @property messageAllow No description
 * @property messageDeny No description
 * @property messageNew No description
 * @property messageRead No description
 * @property messageReply No description
 * @property messageTypingState No description
 * @property messagesEdit No description
 * @property photoCommentDelete No description
 * @property photoCommentEdit No description
 * @property photoCommentNew No description
 * @property photoCommentRestore No description
 * @property photoNew No description
 * @property pollVoteNew No description
 * @property userBlock No description
 * @property userUnblock No description
 * @property videoCommentDelete No description
 * @property videoCommentEdit No description
 * @property videoCommentNew No description
 * @property videoCommentRestore No description
 * @property videoNew No description
 * @property wallPostNew No description
 * @property wallReplyDelete No description
 * @property wallReplyEdit No description
 * @property wallReplyNew No description
 * @property wallReplyRestore No description
 * @property wallRepost No description
 */
data class LongPollEvents(
    val audioNew: BoolInt,
    val boardPostDelete: BoolInt,
    val boardPostEdit: BoolInt,
    val boardPostNew: BoolInt,
    val boardPostRestore: BoolInt,
    val groupChangePhoto: BoolInt,
    val groupChangeSettings: BoolInt,
    val groupJoin: BoolInt,
    val groupLeave: BoolInt,
    val groupOfficersEdit: BoolInt,
    val leadFormsNew: BoolInt? = null,
    val marketCommentDelete: BoolInt,
    val marketCommentEdit: BoolInt,
    val marketCommentNew: BoolInt,
    val marketCommentRestore: BoolInt,
    val messageAllow: BoolInt,
    val messageDeny: BoolInt,
    val messageNew: BoolInt,
    val messageRead: BoolInt,
    val messageReply: BoolInt,
    val messageTypingState: BoolInt,
    val messagesEdit: BoolInt,
    val photoCommentDelete: BoolInt,
    val photoCommentEdit: BoolInt,
    val photoCommentNew: BoolInt,
    val photoCommentRestore: BoolInt,
    val photoNew: BoolInt,
    val pollVoteNew: BoolInt,
    val userBlock: BoolInt,
    val userUnblock: BoolInt,
    val videoCommentDelete: BoolInt,
    val videoCommentEdit: BoolInt,
    val videoCommentNew: BoolInt,
    val videoCommentRestore: BoolInt,
    val videoNew: BoolInt,
    val wallPostNew: BoolInt,
    val wallReplyDelete: BoolInt,
    val wallReplyEdit: BoolInt,
    val wallReplyNew: BoolInt,
    val wallReplyRestore: BoolInt,
    val wallRepost: BoolInt
)
