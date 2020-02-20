package name.anton3.vkapi.vktypes

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonValue

data class BoolInt(@JsonIgnore val value: Boolean) {

    @Suppress("unused")
    @get:JsonValue
    internal val intValue: Int
        get() = if (value) 1 else 0

    internal companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(intValue: Int): BoolInt = BoolInt(intValue != 0)
    }
}
