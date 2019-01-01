package name.anton3.vkapi.generated.apps.objects

import name.anton3.vkapi.generated.users.objects.UserMin

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property profiles No description
 */
data class GetLeaderboardExtendedResponse(
    val count: Int? = null,
    val items: List<Leaderboard>? = null,
    val profiles: List<UserMin>? = null
)
