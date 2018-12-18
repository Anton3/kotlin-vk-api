@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.common.objects.Reason
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

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
) : VkMethod<OkResponse>("wall.reportComment", jacksonTypeRef()),
    UserMethod
