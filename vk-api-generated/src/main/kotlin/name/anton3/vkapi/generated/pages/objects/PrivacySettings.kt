package name.anton3.vkapi.generated.pages.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class PrivacySettings(@JsonValue override val value: Int) : Value<Int> {
    COMMUNITY_MANAGERS_ONLY(0),
    COMMUNITY_MEMBERS_ONLY(1),
    EVERYONE(2);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): PrivacySettings = parseEnum(value)
    }
}
