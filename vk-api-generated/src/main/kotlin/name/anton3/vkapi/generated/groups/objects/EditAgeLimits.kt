@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class EditAgeLimits(override val value: Int) : ValueEnum<Int> {
    UNLIMITED(1),
    N_16_PLUS(2),
    N_18_PLUS(3)
}
