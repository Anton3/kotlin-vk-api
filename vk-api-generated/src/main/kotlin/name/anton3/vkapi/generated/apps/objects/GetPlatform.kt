package name.anton3.vkapi.generated.apps.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetPlatform(@JsonValue override val value: String) : Value<String> {
    WEB("web"),
    IOS("ios"),
    ANDROID("android"),
    WINPHONE("winphone");

    companion object {
        @JvmStatic @JsonCreator
        fun parse(value: String): GetPlatform = parseEnum(value)
    }
}
