@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.wall.objects.WallpostFull
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/fave.getPosts]
 *
 * Returns a list of wall posts that the current user has liked.
 *
 * @property offset Offset needed to return a specific subset of posts.
 * @property count Number of posts to return.
 * @property extended '1' — to return additional 'wall', 'profiles', and 'groups' fields. By default: '0'.
 */
data class FaveGetPosts(
    var offset: Int? = null,
    var count: Int? = null,
    var extended: Boolean? = null
) : CheckedMethod<VkList<WallpostFull>, UserMethod>("fave.getPosts", jacksonTypeRef())
