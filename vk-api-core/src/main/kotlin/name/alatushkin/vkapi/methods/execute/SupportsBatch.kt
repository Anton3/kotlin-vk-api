package name.alatushkin.vkapi.methods.execute

import name.alatushkin.vkapi.core.VkMethod

fun VkMethod<*>.supportsBatch(): Boolean {
    return when (apiMethodName.substringBefore('.')) {
        "execute" -> false
        else -> true
    }
}
