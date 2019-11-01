@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.account.objects.NameRequest
import name.anton3.vkapi.generated.account.objects.UserSettingsInterests
import name.anton3.vkapi.generated.audio.objects.Audio
import name.anton3.vkapi.generated.common.objects.City
import name.anton3.vkapi.generated.common.objects.Country
import name.anton3.vkapi.generated.common.objects.Sex
import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.VkBirthDate

/**
 * No description
 *
 * @property connections No description
 * @property bdate User's date of birth
 * @property bdateVisibility Information whether user's birthdate are hidden
 * @property city No description
 * @property country No description
 * @property firstName User first name
 * @property homeTown User's hometown
 * @property lastName User last name
 * @property maidenName User maiden name
 * @property nameRequest No description
 * @property personal No description
 * @property phone User phone number with some hidden digits
 * @property relation User relationship status
 * @property relationPartner No description
 * @property relationPending Information whether relation status is pending
 * @property relationRequests No description
 * @property screenName Domain name of the user's page
 * @property sex User sex
 * @property status User status
 * @property statusAudio No description
 * @property interests No description
 * @property languages No description
 */
@JsonDeserialize(`as` = UserSettingsXtrImpl::class)
interface UserSettingsXtr {
    val connections: UserConnections?
    val bdate: VkBirthDate?
    val bdateVisibility: Int?
    val city: City?
    val country: Country?
    val firstName: String?
    val homeTown: String
    val lastName: String?
    val maidenName: String?
    val nameRequest: NameRequest?
    val personal: Personal?
    val phone: String?
    val relation: UserRelation?
    val relationPartner: UserMin?
    val relationPending: BoolInt?
    val relationRequests: List<UserMin>?
    val screenName: String?
    val sex: Sex?
    val status: String
    val statusAudio: Audio?
    val interests: UserSettingsInterests?
    val languages: List<String>?
}
