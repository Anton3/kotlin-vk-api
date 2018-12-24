package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class AccountType(@get:JsonValue val value: String) {
    GENERAL("general"),
    AGENCY("agency")
}
