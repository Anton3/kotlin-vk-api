@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.NameCase
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/users.getFollowers]
 *
 * Returns a list of IDs of followers of the user in question, sorted by date added, most recent first.
 *
 * @property userId User ID.
 * @property offset Offset needed to return a specific subset of followers.
 * @property count Number of followers to return.
 * @property nameCase Case for declension of user name and surname: 'nom' — nominative (default), 'gen' — genitive , 'dat' — dative, 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
data class UsersGetFollowers(
    var userId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var nameCase: NameCase? = null
) : VkMethod<VkList<Int>, UserServiceMethod>("users.getFollowers", jacksonTypeRef())
