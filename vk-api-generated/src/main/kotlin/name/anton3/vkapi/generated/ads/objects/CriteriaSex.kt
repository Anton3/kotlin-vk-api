package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class CriteriaSex(@get:JsonValue val value: String) {
    ANY("0"),
    MALE("1"),
    FEMALE("2")
}
