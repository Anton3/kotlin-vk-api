package name.anton3.vkapi.generated.friends.responses

import com.fasterxml.jackson.annotation.JsonValue

enum class AddResponse(@get:JsonValue val value: String) {
    SEND("1"),
    APPROVED("2"),
    RESEND("4")
}
