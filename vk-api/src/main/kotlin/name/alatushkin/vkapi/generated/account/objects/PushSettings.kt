package name.alatushkin.vkapi.generated.account.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt

data class PushSettings(
    val disabled: BoolInt? = null,
    val disabledUntil: Long? = null,
    val conversations: PushConversations? = null,
    val settings: PushParams? = null
)
