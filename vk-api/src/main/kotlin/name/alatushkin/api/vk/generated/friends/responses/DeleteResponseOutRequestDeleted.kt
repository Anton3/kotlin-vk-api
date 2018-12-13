package name.alatushkin.api.vk.generated.friends.responses

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class DeleteResponseOutRequestDeleted(@JsonValue val jsonValue: String) {
    OK("1");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): DeleteResponseOutRequestDeleted =
            DeleteResponseOutRequestDeleted.values().find { it.jsonValue == value }!!
    }
}
