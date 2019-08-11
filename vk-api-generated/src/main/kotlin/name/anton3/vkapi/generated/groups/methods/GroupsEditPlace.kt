@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.EditPlaceResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/groups.editPlace]
 *
 * Edits the place in community.
 *
 * @property groupId Community ID.
 * @property title Place title.
 * @property address Place address.
 * @property countryId Country ID.
 * @property cityId City ID.
 * @property latitude Geographical latitude.
 * @property longitude Geographical longitude.
 */
data class GroupsEditPlace(
    var groupId: Int,
    var title: String? = null,
    var address: String? = null,
    var countryId: Int? = null,
    var cityId: Int? = null,
    var latitude: Double? = null,
    var longitude: Double? = null
) : CheckedMethod<EditPlaceResponse, UserMethod>("groups.editPlace", jacksonTypeRef())
