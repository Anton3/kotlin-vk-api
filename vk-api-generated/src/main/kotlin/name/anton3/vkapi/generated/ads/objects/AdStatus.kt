package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class AdStatus(@get:JsonValue val value: String) {
    STOPPED("0"),
    STARTED("1"),
    DELETED("2")
}
