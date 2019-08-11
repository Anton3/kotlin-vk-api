@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.account.objects.SaveProfileInfoBdateVisibility
import name.anton3.vkapi.generated.account.objects.SaveProfileInfoRelation
import name.anton3.vkapi.generated.account.objects.SaveProfileInfoResponse
import name.anton3.vkapi.generated.common.objects.OwnSex
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/account.saveProfileInfo]
 *
 * Edits current profile info.
 *
 * @property firstName User first name.
 * @property lastName User last name.
 * @property maidenName User maiden name (female only)
 * @property screenName User screen name.
 * @property cancelRequestId ID of the name change request to be canceled. If this parameter is sent, all the others are ignored.
 * @property sex User sex. Possible values: , * '1' – female,, * '2' – male.
 * @property relation User relationship status. Possible values: , * '1' – single,, * '2' – in a relationship,, * '3' – engaged,, * '4' – married,, * '5' – it's complicated,, * '6' – actively searching,, * '7' – in love,, * '0' – not specified.
 * @property relationPartnerId ID of the relationship partner.
 * @property bdate User birth date, format: DD.MM.YYYY.
 * @property bdateVisibility Birth date visibility. Returned values: , * '1' – show birth date,, * '2' – show only month and day,, * '0' – hide birth date.
 * @property homeTown User home town.
 * @property countryId User country.
 * @property cityId User city.
 * @property status Status text.
 */
data class AccountSaveProfileInfo(
    var firstName: String? = null,
    var lastName: String? = null,
    var maidenName: String? = null,
    var screenName: String? = null,
    var cancelRequestId: Int? = null,
    var sex: OwnSex? = null,
    var relation: SaveProfileInfoRelation? = null,
    var relationPartnerId: Int? = null,
    var bdate: String? = null,
    var bdateVisibility: SaveProfileInfoBdateVisibility? = null,
    var homeTown: String? = null,
    var countryId: Int? = null,
    var cityId: Int? = null,
    var status: String? = null
) : CheckedMethod<SaveProfileInfoResponse, UserMethod>("account.saveProfileInfo", jacksonTypeRef())
