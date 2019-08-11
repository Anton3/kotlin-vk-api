package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property online Information whether user is online
 * @property time Time when user was online in Unixtime
 */
data class LastActivity(
    val online: BoolInt,
    val time: Int
)
