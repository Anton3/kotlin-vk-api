@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.apps.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetCatalogFilter(override val value: String) : ValueEnum<String> {
    FAVORITE("favorite"),
    FEATURED("featured"),
    INSTALLED("installed"),
    NEW("new")
}
