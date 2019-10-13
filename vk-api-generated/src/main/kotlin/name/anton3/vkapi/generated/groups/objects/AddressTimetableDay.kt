@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

/**
 * Timetable for one day
 *
 * @property breakCloseTime Close time of the break in minutes
 * @property breakOpenTime Start time of the break in minutes
 * @property closeTime Close time in minutes
 * @property openTime Open time in minutes
 */
data class AddressTimetableDay(
    val breakCloseTime: Int? = null,
    val breakOpenTime: Int? = null,
    val closeTime: Int,
    val openTime: Int
)
