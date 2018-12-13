package name.alatushkin.vkapi.tokens

val Token<*>.clientSecret: String?
    get() = when (this) {
        is ServiceToken -> clientSecret
        else -> null
    }

val Token<*>.peerId: Long?
    get() = when (this) {
        is UserToken -> id
        is GroupToken -> -id
        else -> null
    }
