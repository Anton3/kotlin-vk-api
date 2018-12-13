@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/groups.get]
 *
 * Returns a list of the communities to which a user belongs.
 *
 * @property userId User ID.
 * @property filter Types of communities to return: 'admin' — to return communities administered by the user , 'editor' — to return communities where the user is an administrator or editor, 'moder' — to return communities where the user is an administrator, editor, or moderator, 'groups' — to return only groups, 'publics' — to return only public pages, 'events' — to return only events
 * @property fields Profile fields to return.
 * @property offset Offset needed to return a specific subset of communities.
 * @property count Number of communities to return.
 */
data class GroupsGet(
    var userId: Long? = null,
    var filter: List<String>? = null,
    var fields: List<String>? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<Long>>(
    "groups.get",
    jacksonTypeRef()
), UserMethod
