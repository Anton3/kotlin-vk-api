package name.alatushkin.vkapi.generated.groups.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt

data class GroupImpl(
    override val id: Long? = null,
    override val name: String? = null,
    override val screenName: String? = null,
    override val deactivated: String? = null,
    override val isClosed: Visibility? = null,
    override val type: Type? = null,
    override val isAdmin: BoolInt? = null,
    override val adminLevel: GroupAdminLevel? = null,
    override val isMember: BoolInt? = null,
    override val photo50: String? = null,
    override val photo100: String? = null,
    override val photo200: String? = null
) : Group
