@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.Reason
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

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
    var ownerId: Int,
    var commentId: Int,
    var reason: Reason? = null
) : CheckedMethod<OkResponse, UserMethod>("photos.reportComment", jacksonTypeRef())
