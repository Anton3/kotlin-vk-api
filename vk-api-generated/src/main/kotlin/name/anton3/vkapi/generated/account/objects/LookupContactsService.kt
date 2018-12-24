package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class LookupContactsService(@get:JsonValue val value: String) {
    EMAIL("email"),
    PHONE("phone"),
    TWITTER("twitter"),
    FACEBOOK("facebook"),
    ODNOKLASSNIKI("odnoklassniki"),
    INSTAGRAM("instagram"),
    GOOGLE("google")
}
