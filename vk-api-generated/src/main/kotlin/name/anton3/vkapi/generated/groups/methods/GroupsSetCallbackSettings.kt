@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserGroupMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.setCallbackSettings]
 *
 * Allow to set notifications settings for group.
 *
 * @property groupId Community ID.
 * @property serverId Server ID.
 * @property messageNew A new incoming message has been received ('0' — disabled, '1' — enabled).
 * @property messageReply A new outcoming message has been received ('0' — disabled, '1' — enabled).
 * @property messageAllow Allowed messages notifications ('0' — disabled, '1' — enabled).
 * @property messageDeny Denied messages notifications ('0' — disabled, '1' — enabled).
 * @property photoNew New photos notifications ('0' — disabled, '1' — enabled).
 * @property audioNew New audios notifications ('0' — disabled, '1' — enabled).
 * @property videoNew New videos notifications ('0' — disabled, '1' — enabled).
 * @property wallReplyNew New wall replies notifications ('0' — disabled, '1' — enabled).
 * @property wallReplyEdit Wall replies edited notifications ('0' — disabled, '1' — enabled).
 * @property wallReplyDelete A wall comment has been deleted ('0' — disabled, '1' — enabled).
 * @property wallReplyRestore A wall comment has been restored ('0' — disabled, '1' — enabled).
 * @property wallPostNew New wall posts notifications ('0' — disabled, '1' — enabled).
 * @property wallRepost New wall posts notifications ('0' — disabled, '1' — enabled).
 * @property boardPostNew New board posts notifications ('0' — disabled, '1' — enabled).
 * @property boardPostEdit Board posts edited notifications ('0' — disabled, '1' — enabled).
 * @property boardPostRestore Board posts restored notifications ('0' — disabled, '1' — enabled).
 * @property boardPostDelete Board posts deleted notifications ('0' — disabled, '1' — enabled).
 * @property photoCommentNew New comment to photo notifications ('0' — disabled, '1' — enabled).
 * @property photoCommentEdit A photo comment has been edited ('0' — disabled, '1' — enabled).
 * @property photoCommentDelete A photo comment has been deleted ('0' — disabled, '1' — enabled).
 * @property photoCommentRestore A photo comment has been restored ('0' — disabled, '1' — enabled).
 * @property videoCommentNew New comment to video notifications ('0' — disabled, '1' — enabled).
 * @property videoCommentEdit A video comment has been edited ('0' — disabled, '1' — enabled).
 * @property videoCommentDelete A video comment has been deleted ('0' — disabled, '1' — enabled).
 * @property videoCommentRestore A video comment has been restored ('0' — disabled, '1' — enabled).
 * @property marketCommentNew New comment to market item notifications ('0' — disabled, '1' — enabled).
 * @property marketCommentEdit A market comment has been edited ('0' — disabled, '1' — enabled).
 * @property marketCommentDelete A market comment has been deleted ('0' — disabled, '1' — enabled).
 * @property marketCommentRestore A market comment has been restored ('0' — disabled, '1' — enabled).
 * @property pollVoteNew A vote in a public poll has been added ('0' — disabled, '1' — enabled).
 * @property groupJoin Joined community notifications ('0' — disabled, '1' — enabled).
 * @property groupLeave Left community notifications ('0' — disabled, '1' — enabled).
 * @property userBlock User added to community blacklist
 * @property userUnblock User removed from community blacklist
 * @property leadFormsNew New form in lead forms
 */
data class GroupsSetCallbackSettings(
    var groupId: Int,
    var serverId: Int? = null,
    var messageNew: Boolean? = null,
    var messageReply: Boolean? = null,
    var messageAllow: Boolean? = null,
    var messageDeny: Boolean? = null,
    var photoNew: Boolean? = null,
    var audioNew: Boolean? = null,
    var videoNew: Boolean? = null,
    var wallReplyNew: Boolean? = null,
    var wallReplyEdit: Boolean? = null,
    var wallReplyDelete: Boolean? = null,
    var wallReplyRestore: Boolean? = null,
    var wallPostNew: Boolean? = null,
    var wallRepost: Boolean? = null,
    var boardPostNew: Boolean? = null,
    var boardPostEdit: Boolean? = null,
    var boardPostRestore: Boolean? = null,
    var boardPostDelete: Boolean? = null,
    var photoCommentNew: Boolean? = null,
    var photoCommentEdit: Boolean? = null,
    var photoCommentDelete: Boolean? = null,
    var photoCommentRestore: Boolean? = null,
    var videoCommentNew: Boolean? = null,
    var videoCommentEdit: Boolean? = null,
    var videoCommentDelete: Boolean? = null,
    var videoCommentRestore: Boolean? = null,
    var marketCommentNew: Boolean? = null,
    var marketCommentEdit: Boolean? = null,
    var marketCommentDelete: Boolean? = null,
    var marketCommentRestore: Boolean? = null,
    var pollVoteNew: Boolean? = null,
    var groupJoin: Boolean? = null,
    var groupLeave: Boolean? = null,
    var userBlock: Boolean? = null,
    var userUnblock: Boolean? = null,
    var leadFormsNew: Boolean? = null
) : VkMethod<OkResponse>("groups.setCallbackSettings", jacksonTypeRef()),
    UserGroupMethod
