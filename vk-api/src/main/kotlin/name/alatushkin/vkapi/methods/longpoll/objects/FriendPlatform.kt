package name.alatushkin.vkapi.methods.longpoll.objects

enum class FriendPlatform(val value: Long) {
    MOBILE(1),
    IPHONE(2),
    IPAD(3),
    ANDROID(4),
    WPHONE(5),
    WINDOWS(6),
    WEB(7);

    companion object {
        fun parse(platformId: Long): FriendPlatform? {
            return FriendPlatform.values().find { it.value == platformId }
        }
    }
}
