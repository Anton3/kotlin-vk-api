package name.alatushkin.vkapi.generated.groups.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt

interface Group {
    val id: Long?
    val name: String?
    val screenName: String?
    val deactivated: String?
    val isClosed: Visibility?
    val type: Type?
    val isAdmin: BoolInt?
    val adminLevel: GroupAdminLevel?
    val isMember: BoolInt?
    val photo50: String?
    val photo100: String?
    val photo200: String?
}
