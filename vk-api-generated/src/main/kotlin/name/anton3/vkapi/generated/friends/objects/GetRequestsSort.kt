package name.anton3.vkapi.generated.friends.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetRequestsSort(@get:JsonValue val value: String) {
    DATE("0"),
    MUTUAL("1")
}
