package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class Reason(@get:JsonValue val value: String) {
    SPAM("0"),
    CHILD_PORNOGRAPHY("1"),
    EXTREMISM("2"),
    VIOLENCE("3"),
    DRUG_PROPAGANDA("4"),
    ADULT_MATERIAL("5"),
    INSULT_ABUSE("6")
}
