package name.alatushkin.vkapi.generated.account.objects

import name.alatushkin.vkapi.generated.common.objects.Country
import name.alatushkin.vkapi.generated.common.objects.Object
import name.alatushkin.vkapi.generated.common.objects.Sex
import name.alatushkin.vkapi.generated.users.objects.UserMin
import name.alatushkin.vkapi.vktypes.VkBirthDate

data class UserSettings(
    val firstName: String? = null,
    val lastName: String? = null,
    val maidenName: String? = null,
    val screenName: String? = null,
    val sex: Sex? = null,
    val relation: Long? = null,
    val relationPartner: UserMin? = null,
    val relationPending: Long? = null,
    val relationRequests: List<UserMin>? = null,
    val bdate: VkBirthDate? = null,
    val bdateVisibility: Long? = null,
    val homeTown: String? = null,
    val country: Country? = null,
    val city: Object? = null,
    val status: String? = null,
    val phone: String? = null,
    val nameRequest: NameRequest? = null
)
