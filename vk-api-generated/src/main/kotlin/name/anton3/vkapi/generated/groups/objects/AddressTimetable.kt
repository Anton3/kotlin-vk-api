@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

/**
 * Timetable for a week
 *
 * @property fri Timetable for friday
 * @property mon Timetable for monday
 * @property sat Timetable for saturday
 * @property sun Timetable for sunday
 * @property thu Timetable for thursday
 * @property tue Timetable for tuesday
 * @property wed Timetable for wednesday
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
