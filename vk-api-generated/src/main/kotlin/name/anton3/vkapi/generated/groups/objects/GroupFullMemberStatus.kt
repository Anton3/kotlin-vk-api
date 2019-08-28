@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GroupFullMemberStatus(override val value: Int) : ValueEnum<Int> {
    NOT_A_MEMBER(0),
    MEMBER(1),
    NOT_SURE(2),
    DECLINED(3),
    HAS_SENT_A_REQUEST(4),
    INVITED(5)
}
