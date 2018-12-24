package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class ReportType(@get:JsonValue val value: String) {
    PORN("porn"),
    SPAM("spam"),
    INSULT("insult"),
    ADVERTISMENT("advertisment")
}
