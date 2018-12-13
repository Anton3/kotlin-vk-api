package name.alatushkin.api.vk.generated.ads.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt

data class Account(
    val accountId: Long,
    val accountType: AccountType,
    val accountStatus: BoolInt,
    val accessRole: AccessRole
)
