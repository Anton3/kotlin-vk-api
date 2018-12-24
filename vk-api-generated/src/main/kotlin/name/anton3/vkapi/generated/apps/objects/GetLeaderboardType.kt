package name.anton3.vkapi.generated.apps.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetLeaderboardType(@get:JsonValue val value: String) {
    LEVEL("level"),
    POINTS("points"),
    SCORE("score")
}
