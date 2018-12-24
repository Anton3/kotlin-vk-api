package name.anton3.vkapi.generated.apps.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class AppType(@JsonValue override val value: String) : Value<String> {
    APP("app"),
    GAME("game"),
    SITE("site"),
    STANDALONE("standalone");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): AppType = parseEnum(value)
    }
}
