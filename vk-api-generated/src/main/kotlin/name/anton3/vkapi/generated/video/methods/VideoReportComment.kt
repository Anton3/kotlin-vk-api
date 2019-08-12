@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.Reason
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.reportComment]
 *
 * Reports (submits a complaint about) a comment on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property commentId ID of the comment being reported.
 * @property reason Reason for the complaint: , 0 – spam , 1 – child pornography , 2 – extremism , 3 – violence , 4 – drug propaganda , 5 – adult material , 6 – insult, abuse
 */
data class VideoReportComment(
    var ownerId: Int,
    var commentId: Int,
    var reason: Reason? = null
) : VkMethod<OkResponse, UserMethod>("video.reportComment", jacksonTypeRef())
