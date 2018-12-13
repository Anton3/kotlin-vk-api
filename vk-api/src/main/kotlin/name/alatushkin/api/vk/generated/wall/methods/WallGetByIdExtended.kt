@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.wall.objects.GetByIdExtendedResponse
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/wall.getById]
 *
 * Returns a list of posts from user or community walls by their IDs.
 *
 * @property posts User or community IDs and post IDs, separated by underscores. Use a negative value to designate a community ID. Example: "93388_21539,93388_20904,2943_4276,-1_1"
 * @property copyHistoryDepth Sets the number of parent elements to include in the array 'copy_history' that is returned if the post is a repost from another wall.
 * @property fields 
 */
data class WallGetByIdExtended(
    var posts: List<String>,
    var copyHistoryDepth: Long? = null,
    var fields: List<String>? = null
) : VkMethod<GetByIdExtendedResponse>(
    "wall.getById",
    jacksonTypeRef()
), UserServiceMethod {
    init {
        unsafeParam("extended", "1")
    }
}
