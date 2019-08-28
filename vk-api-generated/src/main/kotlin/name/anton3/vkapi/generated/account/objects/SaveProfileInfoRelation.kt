@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class SaveProfileInfoRelation(override val value: Int) : ValueEnum<Int> {
    SINGLE(1),
    RELATIONSHIP(2),
    ENGAGED(3),
    MARRIED(4),
    COMPLICATED(5),
    ACTIVELY_SEARCHING(6),
    IN_LOVE(7),
    NOT_SPECIFIED(0)
}
