@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.BoolInt

/**
 * [https://vk.com/dev/wall.closeComments]
 *
 * No description
 *
 * @property ownerId No description
 * @property postId No description
 */
data class WallCloseComments(
    var ownerId: Int,
    var postId: Int
) : VkMethod<BoolInt, UserGroupMethod>("wall.closeComments", jacksonTypeRef())
