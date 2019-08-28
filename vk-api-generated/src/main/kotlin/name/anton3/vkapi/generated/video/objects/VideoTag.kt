@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.objects

import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property userId Tagged user ID
 * @property id Tag ID
 * @property placerId ID of the tag creator
 * @property taggedName Tag description
 * @property date Date when tag has been added in Unixtime
 * @property viewed Information whether tha tag is reviewed
 */
data class VideoTag(
    val userId: Int,
    val id: Int,
    val placerId: Int,
    val taggedName: String,
    val date: VkDate,
    val viewed: BoolInt
)
