@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.pages.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class Access(override val value: Int) : ValueEnum<Int> {
    MANAGERS(0),
    MEMBERS(1),
    ALL(2)
}
