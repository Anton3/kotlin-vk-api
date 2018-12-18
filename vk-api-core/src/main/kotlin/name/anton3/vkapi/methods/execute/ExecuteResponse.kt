package name.anton3.vkapi.methods.execute

import name.anton3.vkapi.vktypes.VkError

data class ExecuteResponse<T>(val response: T, val executeErrors: List<VkError>)
