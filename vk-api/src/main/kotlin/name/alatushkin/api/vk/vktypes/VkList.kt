package name.alatushkin.api.vk.vktypes

data class VkList<T>(val count: Int, val items: List<T>) : List<T> by items
