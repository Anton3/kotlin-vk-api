package name.anton3.vkapi.methods.longpoll.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class OfflineReason(override val value: Int) : ValueEnum<Int> {
    LEAVING(0),
    TIMEOUT(1)
}
