@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.generated.common.objects.Reason
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.reportComment]
 *
 * Reports (submits a complaint about) a comment on a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property commentId ID of the comment being reported.
 * @property reason Reason for the complaint: '0' – spam, '1' – child pornography, '2' – extremism, '3' – violence, '4' – drug propaganda, '5' – adult material, '6' – insult, abuse
 */
data class PhotosReportComment(
    var ownerId: Long,
    var commentId: Long,
    var reason: Reason? = null
) : VkMethod<OkResponse>(
    "photos.reportComment",
    jacksonTypeRef()
), UserMethod
