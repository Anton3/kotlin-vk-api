package name.alatushkin.api.vk.generated.common.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class OwnSex(@JsonValue val jsonValue: String) {
    UNDEFINED("0"),
    FEMALE("1"),
    MALE("2");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): OwnSex =
            OwnSex.values().find { it.jsonValue == value }!!
    }
}
