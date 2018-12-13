package name.alatushkin.vkapi.generated.common.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class OkResponse(@JsonValue val jsonValue: String) {
    OK("1");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): OkResponse =
            OkResponse.values().find { it.jsonValue == value }!!
    }
}
