package name.alatushkin.api.vk.vktypes

data class VkIterator<T>(val next: String, val items: List<T>)
