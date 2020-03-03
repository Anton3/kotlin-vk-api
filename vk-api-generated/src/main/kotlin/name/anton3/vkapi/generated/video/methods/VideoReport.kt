@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.ReportReason
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.report]
 *
 * Reports (submits a complaint about) a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 * @property reason Reason for the complaint: '0' – spam, '1' – child pornography, '2' – extremism, '3' – violence, '4' – drug propaganda, '5' – adult material, '6' – insult, abuse
 * @property comment Comment describing the complaint.
 * @property searchQuery (If the video was found in search results.) Search query string.
 */
data class VideoReport(
    var ownerId: Int,
    var videoId: Int,
    var reason: ReportReason? = null,
    var comment: String? = null,
    var searchQuery: String? = null
) : VkMethod<OkResponse, UserMethod>("video.report", jacksonTypeRef())
