@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.board.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetTopicsOrder(override val value: Int) : ValueEnum<Int> {
    UPDATED_DESC(1),
    CREATED_DESC(2),
    UPDATED_ASC(-1),
    CREATED_ASC(-2),
    AS_BY_ADMINISTRATOR(0)
}
