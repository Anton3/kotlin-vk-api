package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class LookupContactsService(@JsonValue val jsonValue: String) {
    EMAIL("email"),
    PHONE("phone"),
    TWITTER("twitter"),
    FACEBOOK("facebook"),
    ODNOKLASSNIKI("odnoklassniki"),
    INSTAGRAM("instagram"),
    GOOGLE("google");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): LookupContactsService =
            LookupContactsService.values().find { it.jsonValue == value }!!
    }
}
