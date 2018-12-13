package name.alatushkin.api.vk.generated.apps.objects

import name.alatushkin.api.vk.generated.users.objects.UserMin

data class GetLeaderboardExtendedResponse(
    val count: Long? = null,
    val items: List<Leaderboard>? = null,
    val profiles: List<UserMin>? = null
)
