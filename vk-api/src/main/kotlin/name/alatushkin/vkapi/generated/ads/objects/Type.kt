package name.alatushkin.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class Type(@JsonValue val jsonValue: String) {
    AD("ad"),
    CAMPAIGN("campaign"),
    CLIENT("client"),
    OFFICE("office");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): Type =
            Type.values().find { it.jsonValue == value }!!
    }
}
