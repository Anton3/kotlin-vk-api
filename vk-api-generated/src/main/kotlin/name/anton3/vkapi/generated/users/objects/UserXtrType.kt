package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.Sex
import name.anton3.vkapi.generated.newsfeed.objects.GetSuggestedSourcesResponse

/**
 * No description
 *
 * @property type No description
 * @property sex User sex
 * @property screenName Domain name of the user's page
 * @property photo50 URL of square photo of the user with 50 pixels in width
 * @property photo100 URL of square photo of the user with 100 pixels in width
 * @property online Information whether the user is online
 * @property onlineMobile Information whether the user is online in mobile site or application
 * @property onlineApp Application ID
 * @property id User ID
 * @property firstName User first name
 * @property lastName User last name
 * @property deactivated Returns if a profile is deleted or blocked
 * @property hidden Returns if a profile is hidden.
 */
@JsonDeserialize(`as` = Void::class)
data class UserXtrType(
    val type: UserType? = null,
    override val sex: Sex? = null,
    override val screenName: String? = null,
    override val photo50: String? = null,
    override val photo100: String? = null,
    override val online: Boolean? = null,
    override val onlineMobile: Boolean? = null,
    override val onlineApp: Int? = null,
    override val id: Int,
    override val firstName: String,
    override val lastName: String,
    override val deactivated: String? = null,
    override val hidden: Int? = null
) : User, GetSubscriptionsExtendedResponse, GetSuggestedSourcesResponse
