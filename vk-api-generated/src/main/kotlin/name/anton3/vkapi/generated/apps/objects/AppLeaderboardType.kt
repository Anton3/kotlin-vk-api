package name.anton3.vkapi.generated.apps.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class AppLeaderboardType(@JsonValue override val value: Int) : Value<Int> {
    NOT_SUPPORTED(0),
    LEVELS(1),
    POINTS(2);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): AppLeaderboardType = parseEnum(value)
    }
}
