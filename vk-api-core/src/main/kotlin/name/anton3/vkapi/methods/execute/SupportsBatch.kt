package name.anton3.vkapi.methods.execute

import name.anton3.vkapi.core.VkMethod

fun VkMethod<*>.supportsBatch(): Boolean {
    return when (apiMethodName.substringBefore('.')) {
        "execute" -> false
        "messages" -> apiMethodName.substringAfter('.') != "setChatPhoto"
        else -> true
    }
}
