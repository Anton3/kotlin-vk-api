@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

/**
 * Timetable for a week
 *
 * @property fri No description
 * @property mon No description
 * @property sat No description
 * @property sun No description
 * @property thu No description
 * @property tue No description
 * @property wed No description
 */
data class AddressTimetable(
    val fri: AddressTimetableDay? = null,
    val mon: AddressTimetableDay? = null,
    val sat: AddressTimetableDay? = null,
    val sun: AddressTimetableDay? = null,
    val thu: AddressTimetableDay? = null,
    val tue: AddressTimetableDay? = null,
    val wed: AddressTimetableDay? = null
)
