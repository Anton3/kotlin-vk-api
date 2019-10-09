@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class UserMinDeactivated(override val value: String) : ValueEnum<String> {
    DELETED("deleted"),
    BANNED("banned")
}
