@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetFilter(override val value: String) : ValueEnum<String> {
    OWNER("owner"),
    OTHERS("others"),
    ALL("all"),
    POSTPONED("postponed"),
    SUGGESTS("suggests")
}
