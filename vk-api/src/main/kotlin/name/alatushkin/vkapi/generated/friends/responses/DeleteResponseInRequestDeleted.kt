package name.alatushkin.vkapi.generated.friends.responses

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class DeleteResponseInRequestDeleted(@JsonValue val jsonValue: String) {
    OK("1");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): DeleteResponseInRequestDeleted =
            DeleteResponseInRequestDeleted.values().find { it.jsonValue == value }!!
    }
}
