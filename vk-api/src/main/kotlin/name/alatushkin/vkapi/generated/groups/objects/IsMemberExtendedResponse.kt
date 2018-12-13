package name.alatushkin.vkapi.generated.groups.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt

data class IsMemberExtendedResponse(
    val member: BoolInt,
    val invitation: BoolInt? = null,
    val request: BoolInt? = null
)
