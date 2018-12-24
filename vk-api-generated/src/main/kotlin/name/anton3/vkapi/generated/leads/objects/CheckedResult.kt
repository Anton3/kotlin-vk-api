package name.anton3.vkapi.generated.leads.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class CheckedResult(@get:JsonValue val value: String) {
    TRUE("true"),
    FALSE("false")
}
