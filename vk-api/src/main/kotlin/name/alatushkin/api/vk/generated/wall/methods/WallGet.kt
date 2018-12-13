@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.wall.objects.GetFilter
import name.alatushkin.api.vk.generated.wall.objects.WallpostFull
import name.alatushkin.api.vk.tokens.UserServiceMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/wall.get]
 *
 * Returns a list of posts on a user wall or community wall.
 *
 * @property ownerId ID of the user or community that owns the wall. By default, current user ID. Use a negative value to designate a community ID.
 * @property domain User or community short address.
 * @property offset Offset needed to return a specific subset of posts.
 * @property count Number of posts to return (maximum 100).
 * @property filter Filter to apply: 'owner' — posts by the wall owner, 'others' — posts by someone else, 'all' — posts by the wall owner and others (default), 'postponed' — timed posts (only available for calls with an 'access_token'), 'suggests' — suggested posts on a community wall
 * @property fields 
 */
data class WallGet(
    var ownerId: Long? = null,
    var domain: String? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var filter: GetFilter? = null,
    var fields: List<String>? = null
) : VkMethod<VkList<WallpostFull>>(
    "wall.get",
    jacksonTypeRef()
), UserServiceMethod
