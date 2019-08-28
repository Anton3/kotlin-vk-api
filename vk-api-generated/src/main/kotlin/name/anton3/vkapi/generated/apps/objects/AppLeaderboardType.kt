@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.apps.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class AppLeaderboardType(override val value: Int) : ValueEnum<Int> {
    NOT_SUPPORTED(0),
    LEVELS(1),
    POINTS(2)
}
