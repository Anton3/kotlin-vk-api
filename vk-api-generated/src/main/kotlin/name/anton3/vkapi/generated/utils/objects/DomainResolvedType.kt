package name.anton3.vkapi.generated.utils.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class DomainResolvedType(@JsonValue override val value: String) : Value<String> {
    USER("user"),
    GROUP("group"),
    APPLICATION("application"),
    PAGE("page");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): DomainResolvedType = parseEnum(value)
    }
}
