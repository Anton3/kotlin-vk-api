package name.alatushkin.vkapi.generated.utils.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class LinkCheckedStatus(@JsonValue val jsonValue: String) {
    NOT_BANNED("not_banned"),
    BANNED("banned"),
    PROCESSING("processing");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): LinkCheckedStatus =
            LinkCheckedStatus.values().find { it.jsonValue == value }!!
    }
}
