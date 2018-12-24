package name.anton3.vkapi.generated.apps.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetLeaderboardType(@JsonValue override val value: String) : Value<String> {
    LEVEL("level"),
    POINTS("points"),
    SCORE("score");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): GetLeaderboardType = parseEnum(value)
    }
}
