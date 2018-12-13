package name.alatushkin.vkapi.generated.ads.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt

data class Account(
    val accountId: Long,
    val accountType: AccountType,
    val accountStatus: BoolInt,
    val accessRole: AccessRole
)
