@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.wall.WallpostFull
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.getPosts]
 *
 * Returns a list of wall posts that the current user has liked.
 *
 * @property offset Offset needed to return a specific subset of posts.
 * @property count Number of posts to return.
 * @property extended '1' — to return additional 'wall', 'profiles', and 'groups' fields. By default: '0'.
 */
class FaveGetPostsMethod(
        offset: Long? = null,
        count: Long? = null,
        extended: Boolean? = null
) : VkMethod<VkList<WallpostFull>>(
    "fave.getPosts",
    mutableMapOf(),
    object : TypeReference<VkSuccess<VkList<WallpostFull>>>() {}
), UserMethod {

    var offset: Long? by props
    var count: Long? by props
    var extended: Boolean? by props

    init {
        this.offset = offset
        this.count = count
        this.extended = extended
    }

    fun setOffset(offset: Long): FaveGetPostsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): FaveGetPostsMethod {
        this.count = count
        return this
    }

    fun setExtended(extended: Boolean): FaveGetPostsMethod {
        this.extended = extended
        return this
    }
}
