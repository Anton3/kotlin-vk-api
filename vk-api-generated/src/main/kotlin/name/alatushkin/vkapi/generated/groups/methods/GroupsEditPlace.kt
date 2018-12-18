@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.groups.objects.EditPlaceResponse
import name.anton3.vkapi.tokens.UserMethod

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
    var groupId: Long,
    var title: String? = null,
    var address: String? = null,
    var countryId: Long? = null,
    var cityId: Long? = null,
    var latitude: Double? = null,
    var longitude: Double? = null
) : VkMethod<EditPlaceResponse>("groups.editPlace", jacksonTypeRef()),
    UserMethod
