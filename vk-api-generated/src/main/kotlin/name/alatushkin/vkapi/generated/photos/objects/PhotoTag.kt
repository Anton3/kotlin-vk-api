package name.anton3.vkapi.generated.photos.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property userId Tagged user ID
 * @property id Tag ID
 * @property placerId ID of the tag creator
 * @property taggedName Tag description
 * @property date Date when tag has been added in Unixtime
 * @property x Coordinate X of the left upper corner
 * @property y Coordinate Y of the left upper corner
 * @property x2 Coordinate X of the right lower corner
 * @property y2 Coordinate Y of the right lower corner
 * @property viewed Information whether the tag is reviewed
 */
data class PhotoTag(
    val userId: Long,
    val id: Long,
    val placerId: Long,
    val taggedName: String,
    val date: VkDate,
    val x: Double,
    val y: Double,
    val x2: Double,
    val y2: Double,
    val viewed: Boolean
)
