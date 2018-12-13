package name.alatushkin.api.vk.execute

import name.alatushkin.api.vk.vktypes.VkError

data class ExecuteResponse<T>(val response: T, val executeErrors: List<VkError>)
