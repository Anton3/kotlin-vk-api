@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

/**
 * No description
 *
 * @property address Place address
 * @property checkins Checkins number
 * @property city City name
 * @property country Country name
 * @property created Date of the place creation in Unixtime
 * @property icon URL of the place's icon
 * @property id Place ID
 * @property latitude Place latitude
 * @property longitude Place longitude
 * @property title Place title
 * @property type Place type
 */
data class Place(
    val address: String? = null,
    val checkins: Int? = null,
    val city: String? = null,
    val country: String? = null,
    val created: Int? = null,
    val icon: String? = null,
    val id: Int? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val title: String? = null,
    val type: String? = null
)
