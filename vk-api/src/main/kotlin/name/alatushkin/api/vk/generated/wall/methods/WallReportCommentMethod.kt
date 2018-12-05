@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.Reason
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/wall.reportComment]
 *
 * Reports (submits a complaint about) a comment on a post on a user wall or community wall.
 *
 * @property ownerId ID of the user or community that owns the wall.
 * @property commentId Comment ID.
 * @property reason Reason for the complaint: '0' – spam, '1' – child pornography, '2' – extremism, '3' – violence, '4' – drug propaganda, '5' – adult material, '6' – insult, abuse
 */
class WallReportCommentMethod(
        ownerId: Long,
        commentId: Long,
        reason: Reason? = null
) : VkMethod<Boolean>(
    "wall.reportComment",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long by props
    var commentId: Long by props
    var reason: Reason? by props

    init {
        this.ownerId = ownerId
        this.commentId = commentId
        this.reason = reason
    }

    fun setOwnerId(ownerId: Long): WallReportCommentMethod {
        this.ownerId = ownerId
        return this
    }

    fun setCommentId(commentId: Long): WallReportCommentMethod {
        this.commentId = commentId
        return this
    }

    fun setReason(reason: Reason): WallReportCommentMethod {
        this.reason = reason
        return this
    }
}
