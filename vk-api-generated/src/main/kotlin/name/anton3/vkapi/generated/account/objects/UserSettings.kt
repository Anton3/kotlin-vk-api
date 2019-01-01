package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.generated.common.objects.Country
import name.anton3.vkapi.generated.common.objects.Object
import name.anton3.vkapi.generated.common.objects.Sex
import name.anton3.vkapi.generated.users.objects.UserMin
import name.anton3.vkapi.vktypes.VkBirthDate

/**
 * No description
 *
 * @property firstName User first name
 * @property lastName User last name
 * @property maidenName User maiden name
 * @property screenName Domain name of the user's page
 * @property sex User sex
 * @property relation User relationship status
 * @property relationPartner No description
 * @property relationPending Information whether relation status is pending
 * @property relationRequests No description
 * @property bdate User's date of birth
 * @property bdateVisibility Information whether user's birthdate are hidden
 * @property homeTown User's hometown
 * @property country No description
 * @property city No description
 * @property status User status
 * @property phone User phone number with some hidden digits
 * @property nameRequest No description
 */
data class UserSettings(
    val firstName: String? = null,
    val lastName: String? = null,
    val maidenName: String? = null,
    val screenName: String? = null,
    val sex: Sex? = null,
    val relation: Int? = null,
    val relationPartner: UserMin? = null,
    val relationPending: Int? = null,
    val relationRequests: List<UserMin>? = null,
    val bdate: VkBirthDate? = null,
    val bdateVisibility: Int? = null,
    val homeTown: String? = null,
    val country: Country? = null,
    val city: Object? = null,
    val status: String? = null,
    val phone: String? = null,
    val nameRequest: NameRequest? = null
)
