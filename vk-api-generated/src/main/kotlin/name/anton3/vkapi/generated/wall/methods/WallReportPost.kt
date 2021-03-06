@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.ReportReason
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/wall.reportPost]
 *
 * Reports (submits a complaint about) a post on a user wall or community wall.
 *
 * @property ownerId ID of the user or community that owns the wall.
 * @property postId Post ID.
 * @property reason Reason for the complaint: '0' – spam, '1' – child pornography, '2' – extremism, '3' – violence, '4' – drug propaganda, '5' – adult material, '6' – insult, abuse
 */
data class WallReportPost(
    var ownerId: Int,
    var postId: Int,
    var reason: ReportReason? = null
) : VkMethod<OkResponse, UserMethod>("wall.reportPost", jacksonTypeRef())
