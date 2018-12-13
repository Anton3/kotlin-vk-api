package name.alatushkin.vkapi.vktypes

data class VkIterator<T>(val next: String, val items: List<T>)
