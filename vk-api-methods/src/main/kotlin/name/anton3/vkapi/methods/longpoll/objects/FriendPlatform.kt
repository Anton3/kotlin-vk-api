package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class FriendPlatform(@get:JsonValue val value: Long) {
    MOBILE(1),
    IPHONE(2),
    IPAD(3),
    ANDROID(4),
    WPHONE(5),
    WINDOWS(6),
    WEB(7)
}
