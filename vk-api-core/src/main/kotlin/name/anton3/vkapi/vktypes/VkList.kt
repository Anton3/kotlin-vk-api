package name.anton3.vkapi.vktypes

data class VkList<T>(val count: Int, val items: List<T>) : List<T> by items
