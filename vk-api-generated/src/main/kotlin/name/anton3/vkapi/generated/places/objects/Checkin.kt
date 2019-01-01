package name.anton3.vkapi.generated.places.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Checkin ID
 * @property userId User ID
 * @property date Date when the checkin has been added in Unixtime
 * @property latitude Place latitude
 * @property longitude Place longitude
 * @property placeId Place ID
 * @property text Comment text
 * @property distance Distance to the place
 * @property placeTitle Place title
 * @property placeCountry Country ID
 * @property placeCity City ID
 * @property placeType Place type
 * @property placeIcon URL of the place's icon
 */
data class Checkin(
    val id: Int,
    val userId: Int,
    val date: VkDate,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val placeId: Int? = null,
    val text: String? = null,
    val distance: Int? = null,
    val placeTitle: String? = null,
    val placeCountry: Int? = null,
    val placeCity: Int? = null,
    val placeType: String? = null,
    val placeIcon: String? = null
)
