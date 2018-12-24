package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class OwnSex(@get:JsonValue val value: String) {
    UNDEFINED("0"),
    FEMALE("1"),
    MALE("2")
}
