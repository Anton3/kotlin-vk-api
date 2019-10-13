@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class UserRelation(override val value: Int) : ValueEnum<Int> {
    NOT_SPECIFIED(0),
    SINGLE(1),
    IN_A_RELATIONSHIP(2),
    ENGAGED(3),
    MARRIED(4),
    COMPLICATED(5),
    ACTIVELY_SEARCHING(6),
    IN_LOVE(7),
    IN_A_CIVIL_UNION(8)
}
