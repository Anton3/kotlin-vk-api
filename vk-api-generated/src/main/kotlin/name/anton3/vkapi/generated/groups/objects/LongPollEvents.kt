@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.BoolInt

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
    val messageNew: BoolInt,
    val messageReply: BoolInt,
    val photoNew: BoolInt,
    val audioNew: BoolInt,
    val videoNew: BoolInt,
    val wallReplyNew: BoolInt,
    val wallReplyEdit: BoolInt,
    val wallReplyDelete: BoolInt,
    val wallReplyRestore: BoolInt,
    val wallPostNew: BoolInt,
    val boardPostNew: BoolInt,
    val boardPostEdit: BoolInt,
    val boardPostRestore: BoolInt,
    val boardPostDelete: BoolInt,
    val photoCommentNew: BoolInt,
    val photoCommentEdit: BoolInt,
    val photoCommentDelete: BoolInt,
    val photoCommentRestore: BoolInt,
    val videoCommentNew: BoolInt,
    val videoCommentEdit: BoolInt,
    val videoCommentDelete: BoolInt,
    val videoCommentRestore: BoolInt,
    val marketCommentNew: BoolInt,
    val marketCommentEdit: BoolInt,
    val marketCommentDelete: BoolInt,
    val marketCommentRestore: BoolInt,
    val pollVoteNew: BoolInt,
    val groupJoin: BoolInt,
    val groupLeave: BoolInt,
    val groupChangeSettings: BoolInt,
    val groupChangePhoto: BoolInt,
    val groupOfficersEdit: BoolInt,
    val messageAllow: BoolInt,
    val messageDeny: BoolInt,
    val wallRepost: BoolInt,
    val userBlock: BoolInt,
    val userUnblock: BoolInt,
    val messagesEdit: BoolInt,
    val messageTypingState: BoolInt,
    val leadFormsNew: BoolInt? = null
)
