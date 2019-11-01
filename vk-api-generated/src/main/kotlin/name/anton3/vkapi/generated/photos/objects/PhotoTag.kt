@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property date Date when tag has been added in Unixtime
 * @property id Tag ID
 * @property placerId ID of the tag creator
 * @property taggedName Tag description
 * @property userId Tagged user ID
 * @property viewed Information whether the tag is reviewed
 * @property x Coordinate X of the left upper corner
 * @property x2 Coordinate X of the right lower corner
 * @property y Coordinate Y of the left upper corner
 * @property y2 Coordinate Y of the right lower corner
 */
data class PhotoTag(
    val date: VkDate,
    val id: Int,
    val placerId: Int,
    val taggedName: String,
    val userId: Int,
    val viewed: BoolInt,
    val x: Double,
    val x2: Double,
    val y: Double,
    val y2: Double
)
