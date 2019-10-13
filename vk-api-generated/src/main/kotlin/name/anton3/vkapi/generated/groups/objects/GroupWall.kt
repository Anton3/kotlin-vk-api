@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GroupWall(override val value: Int) : ValueEnum<Int> {
    DISABLED(0),
    OPEN(1),
    LIMITED(2),
    CLOSED(3)
}
