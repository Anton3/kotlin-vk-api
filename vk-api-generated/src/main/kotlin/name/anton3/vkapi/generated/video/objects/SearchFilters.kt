@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class SearchFilters(override val value: String) : ValueEnum<String> {
    YOUTUBE("youtube"),
    VIMEO("vimeo"),
    SHORT("short"),
    LONG("long")
}
