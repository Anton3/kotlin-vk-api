package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class PushParamsSettings(@get:JsonValue val value: String) {
    ON("on"),
    OFF("off"),
    FR_OF_FR("fr_of_fr")
}
