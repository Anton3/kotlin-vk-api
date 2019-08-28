@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.board.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class DefaultOrder(override val value: Int) : ValueEnum<Int> {
    DESC_UPDATED(1),
    DESC_CREATED(2),
    ASC_UPDATED(-1),
    ASC_CREATED(-2)
}
