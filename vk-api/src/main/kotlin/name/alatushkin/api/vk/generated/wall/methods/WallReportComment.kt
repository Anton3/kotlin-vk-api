@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.generated.common.objects.Reason
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
data class WallReportComment(
    var ownerId: Long,
    var commentId: Long,
    var reason: Reason? = null
) : VkMethod<OkResponse>(
    "wall.reportComment",
    jacksonTypeRef()
), UserMethod
