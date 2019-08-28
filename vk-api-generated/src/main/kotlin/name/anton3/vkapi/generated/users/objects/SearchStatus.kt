@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class SearchStatus(override val value: Int) : ValueEnum<Int> {
    NOT_SPECIFIED(0),
    NOT_MARRIED(1),
    RELATIONSHIP(2),
    ENGAGED(3),
    MARRIED(4),
    COMPLICATED(5),
    ACTIVELY_SEARCHING(6),
    IN_LOVE(7)
}
