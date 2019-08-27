package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class SaveProfileInfoRelation(@JsonValue override val value: Int) : Value<Int> {
    SINGLE(1),
    RELATIONSHIP(2),
    ENGAGED(3),
    MARRIED(4),
    COMPLICATED(5),
    ACTIVELY_SEARCHING(6),
    IN_LOVE(7),
    NOT_SPECIFIED(0);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): SaveProfileInfoRelation = parseEnum(value)
    }
}
