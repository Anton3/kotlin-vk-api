package name.alatushkin.vkapi.generated.places.objects

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
 * @property country Country ID
 * @property city City ID
 * @property address Place address
 * @property distance Distance to the place
 * @property groupId Community ID
 * @property groupPhoto URL of the community's photo
 */
data class PlaceFull(
    val id: Long? = null,
    val title: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val created: Long? = null,
    val icon: String? = null,
    val checkins: Long? = null,
    val type: String? = null,
    val country: Long? = null,
    val city: Long? = null,
    val address: String? = null,
    val distance: Long? = null,
    val groupId: Long? = null,
    val groupPhoto: String? = null
)
