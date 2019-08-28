@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.search.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class HintSection(override val value: String) : ValueEnum<String> {
    GROUPS("groups"),
    EVENTS("events"),
    PUBLICS("publics"),
    CORRESPONDENTS("correspondents"),
    PEOPLE("people"),
    FRIENDS("friends"),
    MUTUAL_FRIENDS("mutual_friends")
}
