@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.appWidgets.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class UpdateType(override val value: String) : ValueEnum<String> {
    COMPACT_LIST("compact_list"),
    COVER_LIST("cover_list"),
    DONATION("donation"),
    LIST("list"),
    MATCH("match"),
    MATCHES("matches"),
    TABLE("table"),
    TEXT("text"),
    TILES("tiles")
}
