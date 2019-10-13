@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notifications.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class SendMessageErrorCode(override val value: Int) : ValueEnum<Int> {
    NOTIFICATIONS_DISABLED(1),
    FLOOD_CONTROL_PER_HOUR(2),
    FLOOD_CONTROL_PER_DAY(3),
    APP_IS_NOT_INSTALLED(4)
}
