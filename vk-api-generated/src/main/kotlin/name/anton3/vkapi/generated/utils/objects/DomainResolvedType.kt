@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class DomainResolvedType(override val value: String) : ValueEnum<String> {
    USER("user"),
    GROUP("group"),
    APPLICATION("application"),
    PAGE("page")
}
