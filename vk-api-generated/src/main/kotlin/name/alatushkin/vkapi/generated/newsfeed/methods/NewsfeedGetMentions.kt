@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.wall.objects.WallpostToId
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/newsfeed.getMentions]
 *
 * Returns a list of posts on user walls in which the current user is mentioned.
 *
 * @property ownerId Owner ID.
 * @property startTime Earliest timestamp (in Unix time) of a post to return. By default, 24 hours ago.
 * @property endTime Latest timestamp (in Unix time) of a post to return. By default, the current time.
 * @property offset Offset needed to return a specific subset of posts.
 * @property count Number of posts to return.
 */
data class NewsfeedGetMentions(
    var ownerId: Long? = null,
    var startTime: Long? = null,
    var endTime: Long? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<WallpostToId>>("newsfeed.getMentions", jacksonTypeRef()),
    UserMethod
