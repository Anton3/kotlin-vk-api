package name.alatushkin.api.vk.generated.account.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt

data class PushSettings(
    val disabled: BoolInt? = null,
    val disabledUntil: Long? = null,
    val conversations: PushConversations? = null,
    val settings: PushParams? = null
)
