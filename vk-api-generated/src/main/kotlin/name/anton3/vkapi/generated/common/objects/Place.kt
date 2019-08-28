@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

/**
 * No description
 *
 * @property id Place ID
 * @property title Place title
 * @property latitude Place latitude
 * @property longitude Place longitude
 * @property created Date of the place creation in Unixtime
 * @property icon URL of the place's icon
 * @property checkins Checkins number
 * @property type Place type
 * @property country Country name
 * @property city City name
 * @property address Place address
 */
data class Place(
    val id: Int? = null,
    val title: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val created: Int? = null,
    val icon: String? = null,
    val checkins: Int? = null,
    val type: String? = null,
    val country: String? = null,
    val city: String? = null,
    val address: String? = null
)
