package name.anton3.vkapi.core

fun VkMethod<*>.supportsBatch(): Boolean {
    return when (apiMethodName.substringBefore('.')) {
        "execute" -> false
        "messages" -> apiMethodName.substringAfter('.') != "setChatPhoto"
        else -> true
    }
}
