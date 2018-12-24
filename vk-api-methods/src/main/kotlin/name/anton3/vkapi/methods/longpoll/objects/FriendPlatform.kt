package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class FriendPlatform(@JsonValue override val value: Long) : Value<Long> {
    MOBILE(1),
    IPHONE(2),
    IPAD(3),
    ANDROID(4),
    WPHONE(5),
    WINDOWS(6),
    WEB(7);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Long): FriendPlatform = parseEnum(value)
    }
}
