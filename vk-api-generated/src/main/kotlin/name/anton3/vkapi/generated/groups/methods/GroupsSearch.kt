@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.generated.groups.objects.SearchSort
import name.anton3.vkapi.generated.groups.objects.Type
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/groups.search]
 *
 * Returns a list of communities matching the search criteria.
 *
 * @property q Search query string.
 * @property type Community type. Possible values: 'group, page, event.'
 * @property countryId Country ID.
 * @property cityId City ID. If this parameter is transmitted, country_id is ignored.
 * @property future '1' — to return only upcoming events. Works with the 'type' = 'event' only.
 * @property market '1' — to return communities with enabled market only.
 * @property sort Sort order. Possible values: *'0' — default sorting (similar the full version of the site),, *'1' — by growth speed,, *'2'— by the "day attendance/members number" ratio,, *'3' — by the "Likes number/members number" ratio,, *'4' — by the "comments number/members number" ratio,, *'5' — by the "boards entries number/members number" ratio.
 * @property offset Offset needed to return a specific subset of results.
 * @property count Number of communities to return. "Note that you can not receive more than first thousand of results, regardless of 'count' and 'offset' values."
 */
data class GroupsSearch(
    var q: String,
    var type: Type? = null,
    var countryId: Int? = null,
    var cityId: Int? = null,
    var future: Boolean? = null,
    var market: Boolean? = null,
    var sort: SearchSort? = null,
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<VkList<Group>>("groups.search", jacksonTypeRef()),
    UserMethod
