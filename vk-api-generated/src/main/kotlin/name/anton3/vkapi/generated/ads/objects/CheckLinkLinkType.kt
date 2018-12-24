package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class CheckLinkLinkType(@JsonValue override val value: String) : Value<String> {
    COMMUNITY("community"),
    POST("post"),
    APPLICATION("application"),
    VIDEO("video"),
    SITE("site");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): CheckLinkLinkType = parseEnum(value)
    }
}
