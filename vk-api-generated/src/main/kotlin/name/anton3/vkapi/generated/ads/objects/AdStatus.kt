package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class AdStatus(@JsonValue override val value: Int) : Value<Int> {
    STOPPED(0),
    STARTED(1),
    DELETED(2);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): AdStatus = parseEnum(value)
    }
}
