package name.alatushkin.vkapi.generated.auth.responses

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class RestoreResponseSuccess(@JsonValue val jsonValue: String) {
    OK("1");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): RestoreResponseSuccess =
            RestoreResponseSuccess.values().find { it.jsonValue == value }!!
    }
}
