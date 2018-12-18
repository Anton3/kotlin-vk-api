package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GroupFullAgeLimits(@JsonValue val jsonValue: String) {
    NO("1"),
    OVER_16("2"),
    OVER_18("3");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GroupFullAgeLimits =
            GroupFullAgeLimits.values().find { it.jsonValue == value }!!
    }
}
