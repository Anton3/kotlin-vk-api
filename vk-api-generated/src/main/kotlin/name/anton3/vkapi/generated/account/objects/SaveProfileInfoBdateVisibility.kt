package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class SaveProfileInfoBdateVisibility(@JsonValue override val value: Int) : Value<Int> {
    SHOW(1),
    HIDE_YEAR(2),
    HIDE(0);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): SaveProfileInfoBdateVisibility = parseEnum(value)
    }
}
