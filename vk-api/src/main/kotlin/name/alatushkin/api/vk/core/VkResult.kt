package name.alatushkin.api.vk.core

import name.alatushkin.api.vk.vktypes.VkApiException
import name.alatushkin.api.vk.vktypes.VkError

sealed class VkResult<T> {
    data class Success<T>(val value: T) : VkResult<T>()
    data class Failure<T>(val error: VkError) : VkResult<T>()

    fun unwrap(): T {
        return when (this) {
            is Success -> value
            is Failure -> throw VkApiException(error)
        }
    }
}
