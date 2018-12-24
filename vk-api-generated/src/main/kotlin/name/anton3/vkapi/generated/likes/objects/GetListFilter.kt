package name.anton3.vkapi.generated.likes.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetListFilter(@JsonValue override val value: String) : Value<String> {
    LIKES("likes"),
    COPIES("copies");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): GetListFilter = parseEnum(value)
    }
}
