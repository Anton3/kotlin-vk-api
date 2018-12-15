package name.alatushkin.vkapi.methods.execute

import name.alatushkin.vkapi.vktypes.VkError

data class ExecuteResponse<T>(val response: T, val executeErrors: List<VkError>)
