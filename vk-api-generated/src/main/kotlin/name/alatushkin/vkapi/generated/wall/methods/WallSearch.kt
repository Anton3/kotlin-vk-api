@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.wall.objects.WallpostFull
import name.alatushkin.vkapi.tokens.UserServiceMethod
import name.alatushkin.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/wall.search]
 *
 * Allows to search posts on user or community walls.
 *
 * @property ownerId user or community id. "Remember that for a community 'owner_id' must be negative."
 * @property domain user or community screen name.
 * @property query search query string.
 * @property ownersOnly '1' – returns only page owner's posts.
 * @property count count of posts to return.
 * @property offset Offset needed to return a specific subset of posts.
 * @property fields No description
 */
data class WallSearch(
    var ownerId: Long? = null,
    var domain: String? = null,
    var query: String? = null,
    var ownersOnly: Boolean? = null,
    var count: Long? = null,
    var offset: Long? = null,
    var fields: List<String>? = null
) : VkMethod<VkList<WallpostFull>>("wall.search", jacksonTypeRef()),
    UserServiceMethod
