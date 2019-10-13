@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetSuggestionsFilter(override val value: String) : ValueEnum<String> {
    MUTUAL("mutual"),
    CONTACTS("contacts"),
    MUTUAL_CONTACTS("mutual_contacts")
}
