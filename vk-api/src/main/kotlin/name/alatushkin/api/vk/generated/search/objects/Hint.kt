package name.alatushkin.api.vk.generated.search.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.groups.objects.Group
import name.alatushkin.api.vk.generated.users.objects.UserMin

data class Hint(
    val type: HintType,
    val section: HintSection,
    val description: String,
    val global: BoolInt? = null,
    val group: Group? = null,
    val profile: UserMin? = null
)
