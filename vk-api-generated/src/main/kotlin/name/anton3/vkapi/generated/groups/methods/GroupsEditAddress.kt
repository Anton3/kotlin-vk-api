@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.Address
import name.anton3.vkapi.generated.groups.objects.AddressWorkInfoStatus
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/groups.editAddress]
 *
 * No description
 *
 * @property groupId No description
 * @property addressId No description
 * @property title No description
 * @property address No description
 * @property additionalAddress No description
 * @property countryId No description
 * @property cityId No description
 * @property metroId No description
 * @property latitude No description
 * @property longitude No description
 * @property phone No description
 * @property workInfoStatus No description
 * @property timetable No description
 * @property isMainAddress No description
 */
data class GroupsEditAddress(
    var groupId: Int,
    var addressId: Int,
    var title: String? = null,
    var address: String? = null,
    var additionalAddress: String? = null,
    var countryId: Int? = null,
    var cityId: Int? = null,
    var metroId: Int? = null,
    var latitude: Double? = null,
    var longitude: Double? = null,
    var phone: String? = null,
    var workInfoStatus: AddressWorkInfoStatus? = null,
    var timetable: String? = null,
    var isMainAddress: Boolean? = null
) : VkMethod<Address, UserGroupMethod>("groups.editAddress", jacksonTypeRef())
