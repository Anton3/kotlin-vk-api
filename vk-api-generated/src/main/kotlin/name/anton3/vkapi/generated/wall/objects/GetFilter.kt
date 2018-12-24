package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetFilter(@JsonValue override val value: String) : Value<String> {
    OWNER("owner"),
    OTHERS("others"),
    ALL("all"),
    POSTPONED("postponed"),
    SUGGESTS("suggests");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): GetFilter = parseEnum(value)
    }
}
