@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.UserGroupFields
import name.anton3.vkapi.generated.wall.objects.WallpostFull
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/wall.getById]
 *
 * Returns a list of posts from user or community walls by their IDs.
 *
 * @property posts User or community IDs and post IDs, separated by underscores. Use a negative value to designate a community ID. Example: "93388_21539,93388_20904,2943_4276,-1_1"
 * @property copyHistoryDepth Sets the number of parent elements to include in the array 'copy_history' that is returned if the post is a repost from another wall.
 * @property fields No description
 */
data class WallGetById(
    var posts: List<String>,
    var copyHistoryDepth: Int? = null,
    var fields: List<UserGroupFields>? = null
) : VkMethod<List<WallpostFull>, UserServiceMethod>("wall.getById", jacksonTypeRef())
