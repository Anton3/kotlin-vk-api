@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import name.anton3.vkapi.generated.groups.objects.GroupFullMemberStatus

/**
 * No description
 *
 * @property address address of event
 * @property buttonText text of attach
 * @property friends array of friends ids
 * @property memberStatus No description
 * @property text text of attach
 * @property time event start time
 */
data class EventActivity(
    val address: String? = null,
    val buttonText: String,
    val friends: List<Int>,
    val memberStatus: GroupFullMemberStatus,
    val text: String,
    val time: Int? = null
)
