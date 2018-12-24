package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class NameCase(@JsonValue override val value: String) : Value<String> {
    NOMINATIVE("nom"),
    GENITIVE("gen"),
    DATIVE("dat"),
    ACCUSATIVE("acc"),
    INSTRUMENTAL("ins"),
    PREPOSITIONAL("abl");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): NameCase = parseEnum(value)
    }
}
