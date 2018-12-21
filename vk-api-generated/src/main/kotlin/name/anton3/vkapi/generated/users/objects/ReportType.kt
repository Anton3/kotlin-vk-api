package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class ReportType(@JsonValue val jsonValue: String) {
    PORN("porn"),
    SPAM("spam"),
    INSULT("insult"),
    ADVERTISMENT("advertisment");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): ReportType =
            ReportType.values().find { it.jsonValue == value }!!
    }
}
