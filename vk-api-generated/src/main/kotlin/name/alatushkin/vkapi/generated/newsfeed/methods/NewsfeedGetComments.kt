@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.newsfeed.objects.GetCommentsResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.getComments]
 *
 * Returns a list of comments in the current user's newsfeed.
 *
 * @property count Number of comments to return. For auto feed, you can use the 'new_offset' parameter returned by this method.
 * @property filters Filters to apply: 'post' — new comments on wall posts, 'photo' — new comments on photos, 'video' — new comments on videos, 'topic' — new comments on discussions, 'note' — new comments on notes,
 * @property reposts Object ID, comments on repost of which shall be returned, e.g. 'wall1_45486'. (If the parameter is set, the 'filters' parameter is optional.),
 * @property startTime Earliest timestamp (in Unix time) of a comment to return. By default, 24 hours ago.
 * @property endTime Latest timestamp (in Unix time) of a comment to return. By default, the current time.
 * @property startFrom Identificator needed to return the next page with results. Value for this parameter returns in 'next_from' field.
 * @property fields Additional fields of [vk.com/dev/fields|profiles] and [vk.com/dev/fields_groups|communities] to return.
 */
data class NewsfeedGetComments(
    var count: Long? = null,
    var filters: List<String>? = null,
    var reposts: String? = null,
    var startTime: Long? = null,
    var endTime: Long? = null,
    var startFrom: String? = null,
    var fields: List<String>? = null
) : VkMethod<GetCommentsResponse>("newsfeed.getComments", jacksonTypeRef()),
    UserMethod
