package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class CreateSubtype(@JsonValue val jsonValue: String) {
    PLACE_OR_BUSINESS("1"),
    COMPANY_OR_WEBSITE("2"),
    PERSON_OR_GROUP("3"),
    PRODUCT_OR_ART("4");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): CreateSubtype =
            CreateSubtype.values().find { it.jsonValue == value }!!
    }
}
