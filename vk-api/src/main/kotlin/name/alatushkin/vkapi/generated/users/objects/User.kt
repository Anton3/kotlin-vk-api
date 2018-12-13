package name.alatushkin.vkapi.generated.users.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.common.objects.Sex

interface User : UserMin {
    val sex: Sex?
    val screenName: String?
    val photo50: String?
    val photo100: String?
    val online: BoolInt?
    val onlineMobile: BoolInt?
    val onlineApp: Long?
    override val id: Long
    override val firstName: String
    override val lastName: String
    override val deactivated: String?
    override val hidden: Long?
}
