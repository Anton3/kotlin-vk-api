package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class NameCase(@get:JsonValue val value: String) {
    NOMINATIVE("nom"),
    GENITIVE("gen"),
    DATIVE("dat"),
    ACCUSATIVE("acc"),
    INSTRUMENTAL("ins"),
    PREPOSITIONAL("abl")
}
