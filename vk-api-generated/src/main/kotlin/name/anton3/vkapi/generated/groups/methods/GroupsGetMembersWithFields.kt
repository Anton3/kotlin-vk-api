@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.groups.objects.GetMembersFilter
import name.anton3.vkapi.generated.groups.objects.GetMembersSort
import name.anton3.vkapi.generated.groups.objects.UserXtrRole
import name.anton3.vkapi.method.UserGroupServiceMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/groups.getMembers]
 *
 * Returns a list of community members.
 *
 * @property groupId ID or screen name of the community.
 * @property sort Sort order. Available values: 'id_asc', 'id_desc', 'time_asc', 'time_desc'. 'time_asc' and 'time_desc' are availavle only if the method is called by the group's 'moderator'.
 * @property offset Offset needed to return a specific subset of community members.
 * @property count Number of community members to return.
 * @property fields List of additional fields to be returned. Available values: 'sex, bdate, city, country, photo_50, photo_100, photo_200_orig, photo_200, photo_400_orig, photo_max, photo_max_orig, online, online_mobile, lists, domain, has_mobile, contacts, connections, site, education, universities, schools, can_post, can_see_all_posts, can_see_audio, can_write_private_message, status, last_seen, common_count, relation, relatives, counters'.
 * @property filter *'friends' – only friends in this community will be returned,, *'unsure' – only those who pressed 'I may attend' will be returned (if it's an event).
 */
data class GroupsGetMembersWithFields(
    var groupId: String? = null,
    var sort: GetMembersSort? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var fields: List<String>? = null,
    var filter: GetMembersFilter? = null
) : VkMethod<VkList<UserXtrRole>>("groups.getMembers", jacksonTypeRef()),
    UserGroupServiceMethod
