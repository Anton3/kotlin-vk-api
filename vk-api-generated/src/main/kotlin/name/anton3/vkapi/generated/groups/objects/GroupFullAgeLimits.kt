package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GroupFullAgeLimits(@get:JsonValue val value: String) {
    NO("1"),
    OVER_16("2"),
    OVER_18("3")
}
