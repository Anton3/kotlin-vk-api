package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class ObjectType(@get:JsonValue val value: String) {
    AD("ad"),
    CAMPAIGN("campaign"),
    CLIENT("client"),
    OFFICE("office")
}
