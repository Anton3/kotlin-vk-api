@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetMembersSort(override val value: String) : ValueEnum<String> {
    ID_ASC("id_asc"),
    ID_DESC("id_desc"),
    TIME_ASC("time_asc"),
    TIME_DESC("time_desc")
}
