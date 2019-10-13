@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class Filter(override val value: String) : ValueEnum<String> {
    ADMIN("admin"),
    EDITOR("editor"),
    MODER("moder"),
    GROUPS("groups"),
    PUBLICS("publics"),
    EVENTS("events"),
    HAS_ADDRESSES("has_addresses")
}
