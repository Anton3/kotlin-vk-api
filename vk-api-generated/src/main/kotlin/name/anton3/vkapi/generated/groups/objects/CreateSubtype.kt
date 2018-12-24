package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class CreateSubtype(@JsonValue override val value: String) : Value<String> {
    PLACE_OR_BUSINESS("1"),
    COMPANY_OR_WEBSITE("2"),
    PERSON_OR_GROUP("3"),
    PRODUCT_OR_ART("4");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): CreateSubtype = parseEnum(value)
    }
}
