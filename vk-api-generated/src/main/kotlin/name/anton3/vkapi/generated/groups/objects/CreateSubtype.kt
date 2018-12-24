package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class CreateSubtype(@get:JsonValue val value: String) {
    PLACE_OR_BUSINESS("1"),
    COMPANY_OR_WEBSITE("2"),
    PERSON_OR_GROUP("3"),
    PRODUCT_OR_ART("4")
}
