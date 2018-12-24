package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class OnOffOptions(@get:JsonValue val value: String) {
    ON("on"),
    OFF("off")
}
