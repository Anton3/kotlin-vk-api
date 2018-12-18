package name.anton3.vkapi.tokens

import name.anton3.vkapi.core.VkMethod

sealed class Token<in M: MethodRequirement> {
    abstract fun <T> attachTo(method: VkMethod<T>)

    abstract val accessToken: String
    abstract val id: Long
}

data class UserToken(
        override val accessToken: String,
        override val id: Long
) : Token<UserMethod>() {

    override fun <T> attachTo(method: VkMethod<T>) {
        method.accessToken = accessToken
    }
}

data class GroupToken(
        override val accessToken: String,
        override val id: Long
) : Token<GroupMethod>() {

    override fun <T> attachTo(method: VkMethod<T>) {
        method.accessToken = accessToken
    }
}

data class ServiceToken(
        override val accessToken: String,
        override val id: Long,
        val clientSecret: String
) : Token<ServiceMethod>() {

    override fun <T> attachTo(method: VkMethod<T>) {
        method.accessToken = accessToken
        if (method.apiMethodName.substringBefore('.') in listOf("secure", "auth")) {
            method.clientSecret = clientSecret
        }
    }
}
