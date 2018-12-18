package name.anton3.vkapi.generated.friends.responses

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class AddResponse(@JsonValue val jsonValue: String) {
    SEND("1"),
    APPROVED("2"),
    RESEND("4");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): AddResponse =
            AddResponse.values().find { it.jsonValue == value }!!
    }
}
