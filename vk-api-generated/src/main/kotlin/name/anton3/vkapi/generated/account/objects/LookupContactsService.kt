package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class LookupContactsService(@JsonValue override val value: String) : Value<String> {
    EMAIL("email"),
    PHONE("phone"),
    TWITTER("twitter"),
    FACEBOOK("facebook"),
    ODNOKLASSNIKI("odnoklassniki"),
    INSTAGRAM("instagram"),
    GOOGLE("google");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): LookupContactsService = parseEnum(value)
    }
}
