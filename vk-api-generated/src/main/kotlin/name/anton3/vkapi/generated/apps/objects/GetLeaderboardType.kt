@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.apps.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetLeaderboardType(override val value: String) : ValueEnum<String> {
    LEVEL("level"),
    POINTS("points"),
    SCORE("score")
}
