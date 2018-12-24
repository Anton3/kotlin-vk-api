package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class AccessRole(@get:JsonValue val value: String) {
    ADMIN("admin"),
    MANAGER("manager"),
    REPORTS("reports")
}
