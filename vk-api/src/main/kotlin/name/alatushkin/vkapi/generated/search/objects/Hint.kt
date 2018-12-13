package name.alatushkin.vkapi.generated.search.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.groups.objects.Group
import name.alatushkin.vkapi.generated.users.objects.UserMin

data class Hint(
    val type: HintType,
    val section: HintSection,
    val description: String,
    val global: BoolInt? = null,
    val group: Group? = null,
    val profile: UserMin? = null
)
