package name.alatushkin.vkapi.generated.apps.objects

import name.alatushkin.vkapi.generated.users.objects.UserMin

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property profiles No description
 */
data class GetLeaderboardExtendedResponse(
    val count: Long? = null,
    val items: List<Leaderboard>? = null,
    val profiles: List<UserMin>? = null
)
