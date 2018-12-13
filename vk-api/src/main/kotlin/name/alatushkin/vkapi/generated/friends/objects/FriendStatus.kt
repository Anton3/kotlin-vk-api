package name.alatushkin.vkapi.generated.friends.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt

data class FriendStatus(
    val userId: Long,
    val friendStatus: FriendStatusStatus,
    val requestMessage: String? = null,
    val readState: BoolInt? = null,
    val sign: String? = null
)
