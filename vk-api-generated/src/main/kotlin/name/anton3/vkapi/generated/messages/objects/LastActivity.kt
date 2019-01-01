package name.anton3.vkapi.generated.messages.objects

/**
 * No description
 *
 * @property online Information whether user is online
 * @property time Time when user was online in Unixtime
 */
data class LastActivity(
    val online: Boolean,
    val time: Int
)
