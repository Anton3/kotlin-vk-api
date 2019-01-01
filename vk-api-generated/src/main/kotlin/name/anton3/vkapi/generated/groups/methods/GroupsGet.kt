@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

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
    var userId: Int? = null,
    var filter: List<String>? = null,
    var fields: List<String>? = null,
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<VkList<Int>>("groups.get", jacksonTypeRef()),
    UserMethod
