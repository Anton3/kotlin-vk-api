package name.alatushkin.api.vk.generated.groups.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt

data class IsMemberExtendedResponse(
    val member: BoolInt,
    val invitation: BoolInt? = null,
    val request: BoolInt? = null
)
