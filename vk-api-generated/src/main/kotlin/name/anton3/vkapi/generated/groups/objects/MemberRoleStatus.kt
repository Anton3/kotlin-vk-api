@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class MemberRoleStatus(override val value: String) : ValueEnum<String> {
    MODERATOR("moderator"),
    EDITOR("editor"),
    ADMINISTRATOR("administrator"),
    CREATOR("creator")
}
