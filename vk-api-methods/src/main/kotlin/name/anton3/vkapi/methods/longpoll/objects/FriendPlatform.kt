package name.anton3.vkapi.methods.longpoll.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class FriendPlatform(override val value: Int) : ValueEnum<Int> {
    MOBILE(1),
    IPHONE(2),
    IPAD(3),
    ANDROID(4),
    WPHONE(5),
    WINDOWS(6),
    WEB(7)
}
