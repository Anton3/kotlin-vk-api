package name.anton3.vkapi.tokens

import name.anton3.vkapi.method.*

sealed class Token<in M : MethodRequirement> {
    abstract fun <T> attachTo(method: VkMethod<T, *>)
}

data class UserToken(val accessToken: String) : Token<UserMethod>() {
    override fun <T> attachTo(method: VkMethod<T, *>) {
        method.accessToken = accessToken
    }
}

data class GroupToken(val accessToken: String) : Token<GroupMethod>() {
    override fun <T> attachTo(method: VkMethod<T, *>) {
        method.accessToken = accessToken
    }
}

data class ServiceToken(val accessToken: String, val clientSecret: String) : Token<ServiceMethod>() {
    override fun <T> attachTo(method: VkMethod<T, *>) {
        method.accessToken = accessToken
        if (method.apiMethodName.substringBefore('.') in listOf("secure", "auth")) {
            method.clientSecret = clientSecret
        }
    }
}
