@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

/**
 * No description
 *
 * @property additionalAddress Additional address to the place (6 floor, left door)
 * @property address String address to the place (Nevsky, 28)
 * @property cityId City id of address
 * @property countryId Country id of address
 * @property distance Distance from the point
 * @property id Address id
 * @property latitude Address latitude
 * @property longitude Address longitude
 * @property metroStationId Metro id of address
 * @property phone Address phone
 * @property timeOffset Time offset int minutes from utc time
 * @property timetable No description
 * @property title Title of the place (Zinger, etc)
 * @property workInfoStatus No description
 */
data class Address(
    val additionalAddress: String? = null,
    val address: String? = null,
    val cityId: Int? = null,
    val countryId: Int? = null,
    val distance: Int? = null,
    val id: Int,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val metroStationId: Int? = null,
    val phone: String? = null,
    val timeOffset: Int? = null,
    val timetable: AddressTimetable? = null,
    val title: String? = null,
    val workInfoStatus: AddressWorkInfoStatus? = null
)
