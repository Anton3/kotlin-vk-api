@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetHistoryRev(override val value: Int) : ValueEnum<Int> {
    CHRONOLOGICAL(1),
    REVERSE_CHRONOLOGICAL(0)
}
