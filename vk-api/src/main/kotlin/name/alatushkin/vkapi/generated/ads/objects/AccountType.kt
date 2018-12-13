package name.alatushkin.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class AccountType(@JsonValue val jsonValue: String) {
    GENERAL("general"),
    AGENCY("agency");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): AccountType =
            AccountType.values().find { it.jsonValue == value }!!
    }
}
