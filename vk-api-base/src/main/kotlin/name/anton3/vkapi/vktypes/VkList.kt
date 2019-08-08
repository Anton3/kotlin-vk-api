package name.anton3.vkapi.vktypes

import com.fasterxml.jackson.annotation.JsonFormat

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
data class VkList<T>(val count: Int, val items: List<T>) : List<T> by items
