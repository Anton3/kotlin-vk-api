package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class UserType(@get:JsonValue val value: String) {
    PROFILE("profile")
}
