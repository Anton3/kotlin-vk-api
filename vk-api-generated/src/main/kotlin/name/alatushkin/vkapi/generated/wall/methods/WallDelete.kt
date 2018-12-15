@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/wall.delete]
 *
 * Deletes a post from a user wall or community wall.
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property postId ID of the post to be deleted.
 */
data class WallDelete(
    var ownerId: Long? = null,
    var postId: Long? = null
) : VkMethod<OkResponse>("wall.delete", jacksonTypeRef()),
    UserMethod
