@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class Visibility(override val value: Int) : ValueEnum<Int> {
    OPEN(0),
    CLOSED(1),
    PRIVATE(2)
}
