package name.anton3.vkapi.generated.apps.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class AppLeaderboardType(@get:JsonValue val value: String) {
    NOT_SUPPORTED("0"),
    LEVELS("1"),
    POINTS("2")
}
