package name.alatushkin.vkapi.generated.video.objects

import name.alatushkin.vkapi.vktypes.VkDate

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
    val userId: Long,
    val id: Long,
    val placerId: Long,
    val taggedName: String,
    val date: VkDate,
    val viewed: Boolean
)
