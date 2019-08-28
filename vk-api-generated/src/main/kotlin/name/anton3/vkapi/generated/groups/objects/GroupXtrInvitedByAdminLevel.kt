@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GroupXtrInvitedByAdminLevel(override val value: Int) : ValueEnum<Int> {
    MODERATOR(1),
    EDITOR(2),
    ADMINISTRATOR(3)
}
