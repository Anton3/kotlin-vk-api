package name.anton3.vkapi.generated.orders.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class ChangeStateAction(@get:JsonValue val value: String) {
    CANCEL("cancel"),
    CHARGE("charge"),
    REFUND("refund")
}
