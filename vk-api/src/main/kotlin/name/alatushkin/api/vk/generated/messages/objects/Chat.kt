package name.alatushkin.api.vk.generated.messages.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt

data class Chat(
    val id: Long,
    val type: String,
    val title: String? = null,
    val adminId: Long,
    val users: List<Long>,
    val pushSettings: ChatPushSettings? = null,
    val photo50: String? = null,
    val photo100: String? = null,
    val photo200: String? = null,
    val left: BoolInt? = null,
    val kicked: BoolInt? = null
)
