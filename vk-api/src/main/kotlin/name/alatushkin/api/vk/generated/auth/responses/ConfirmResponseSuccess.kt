package name.alatushkin.api.vk.generated.auth.responses

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class ConfirmResponseSuccess(@JsonValue val jsonValue: String) {
    OK("1");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): ConfirmResponseSuccess =
            ConfirmResponseSuccess.values().find { it.jsonValue == value }!!
    }
}
