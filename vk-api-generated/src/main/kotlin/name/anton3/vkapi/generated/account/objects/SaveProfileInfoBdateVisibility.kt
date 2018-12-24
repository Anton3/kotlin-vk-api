package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class SaveProfileInfoBdateVisibility(@get:JsonValue val value: String) {
    SHOW("1"),
    HIDE_YEAR("2"),
    HIDE("0")
}
