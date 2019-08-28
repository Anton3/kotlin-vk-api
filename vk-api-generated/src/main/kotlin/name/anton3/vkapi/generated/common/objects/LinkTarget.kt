@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class LinkTarget(override val value: String) : ValueEnum<String> {
    INTERNAL("internal"),
    EXTERNAL("external"),
    OTHER("other")
}
