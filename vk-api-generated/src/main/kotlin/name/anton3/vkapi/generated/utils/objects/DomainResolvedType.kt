package name.anton3.vkapi.generated.utils.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class DomainResolvedType(@get:JsonValue val value: String) {
    USER("user"),
    GROUP("group"),
    APPLICATION("application"),
    PAGE("page")
}
