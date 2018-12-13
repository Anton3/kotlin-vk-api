package name.alatushkin.vkapi.generated.apps.objects

import name.alatushkin.vkapi.generated.users.objects.UserMin

data class GetLeaderboardExtendedResponse(
    val count: Long? = null,
    val items: List<Leaderboard>? = null,
    val profiles: List<UserMin>? = null
)
