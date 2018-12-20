package name.anton3.vkapi.tokens

import name.anton3.vkapi.core.VkMethod

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

fun <M: VkMethod<*>> M.attach(token: Token<*>): M {
    token.attachTo(this)
    return this
}
