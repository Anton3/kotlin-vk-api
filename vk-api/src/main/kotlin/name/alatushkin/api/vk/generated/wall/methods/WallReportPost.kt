@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.generated.common.objects.Reason
import name.alatushkin.api.vk.tokens.UserMethod

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
    var ownerId: Long,
    var postId: Long,
    var reason: Reason? = null
) : VkMethod<OkResponse>(
    "wall.reportPost",
    jacksonTypeRef()
), UserMethod
