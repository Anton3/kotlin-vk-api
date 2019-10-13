@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetPagesType(override val value: String) : ValueEnum<String> {
    GROUPS("groups"),
    HINTS("hints"),
    USERS("users")
}
