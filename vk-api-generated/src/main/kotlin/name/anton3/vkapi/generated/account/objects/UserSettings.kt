@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.audio.objects.Audio
import name.anton3.vkapi.generated.common.objects.City
import name.anton3.vkapi.generated.common.objects.Country
import name.anton3.vkapi.generated.common.objects.Sex
import name.anton3.vkapi.generated.users.objects.Personal
import name.anton3.vkapi.generated.users.objects.UserConnections
import name.anton3.vkapi.generated.users.objects.UserMin
import name.anton3.vkapi.generated.users.objects.UserRelation
import name.anton3.vkapi.generated.users.objects.UserSettingsXtr
import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.VkBirthDate

/**
 * No description
 *
 * @property deactivated Returns if a profile is deleted or blocked
 * @property firstName User first name
 * @property hidden Returns if a profile is hidden.
 * @property id User ID
 * @property lastName User last name
 * @property canAccessClosed No description
 * @property isClosed No description
 * @property connections No description
 * @property bdate User's date of birth
 * @property bdateVisibility Information whether user's birthdate are hidden
 * @property city No description
 * @property country No description
 * @property homeTown User's hometown
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
@JsonDeserialize(`as` = Void::class)
data class UserSettings(
    override val deactivated: String? = null,
    override val firstName: String,
    override val hidden: Int? = null,
    override val id: Int,
    override val lastName: String,
    override val canAccessClosed: Boolean? = null,
    override val isClosed: Boolean? = null,
    override val connections: UserConnections? = null,
    override val bdate: VkBirthDate? = null,
    override val bdateVisibility: Int? = null,
    override val city: City? = null,
    override val country: Country? = null,
    override val homeTown: String,
    override val maidenName: String? = null,
    override val nameRequest: NameRequest? = null,
    override val personal: Personal? = null,
    override val phone: String? = null,
    override val relation: UserRelation? = null,
    override val relationPartner: UserMin? = null,
    override val relationPending: BoolInt? = null,
    override val relationRequests: List<UserMin>? = null,
    override val screenName: String? = null,
    override val sex: Sex? = null,
    override val status: String,
    override val statusAudio: Audio? = null,
    override val interests: UserSettingsInterests? = null,
    override val languages: List<String>? = null
) : UserMin, UserSettingsXtr
