@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.likes.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetListFilter(override val value: String) : ValueEnum<String> {
    LIKES("likes"),
    COPIES("copies")
}
