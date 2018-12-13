@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.NameCase
import name.alatushkin.api.vk.generated.users.objects.UserFull
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/groups.getInvitedUsers]
 *
 * Returns invited users list of a community
 *
 * @property groupId Group ID to return invited users for.
 * @property offset Offset needed to return a specific subset of results.
 * @property count Number of results to return.
 * @property fields List of additional fields to be returned. Available values: 'sex, bdate, city, country, photo_50, photo_100, photo_200_orig, photo_200, photo_400_orig, photo_max, photo_max_orig, online, online_mobile, lists, domain, has_mobile, contacts, connections, site, education, universities, schools, can_post, can_see_all_posts, can_see_audio, can_write_private_message, status, last_seen, common_count, relation, relatives, counters'.
 * @property nameCase Case for declension of user name and surname. Possible values: *'nom' — nominative (default),, *'gen' — genitive,, *'dat' — dative,, *'acc' — accusative, , *'ins' — instrumental,, *'abl' — prepositional.
 */
data class GroupsGetInvitedUsers(
    var groupId: Long,
    var offset: Long? = null,
    var count: Long? = null,
    var fields: List<String>? = null,
    var nameCase: NameCase? = null
) : VkMethod<VkList<UserFull>>(
    "groups.getInvitedUsers",
    jacksonTypeRef()
), UserMethod
