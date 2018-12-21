@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.board.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.board.objects.GetTopicsOrder
import name.anton3.vkapi.generated.board.objects.GetTopicsPreview
import name.anton3.vkapi.generated.board.objects.GetTopicsResponse
import name.anton3.vkapi.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/board.getTopics]
 *
 * Returns a list of topics on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicIds IDs of topics to be returned (100 maximum). By default, all topics are returned. If this parameter is set, the 'order', 'offset', and 'count' parameters are ignored.
 * @property order Sort order: '1' — by date updated in reverse chronological order. '2' — by date created in reverse chronological order. '-1' — by date updated in chronological order. '-2' — by date created in chronological order. If no sort order is specified, topics are returned in the order specified by the group administrator. Pinned topics are returned first, regardless of the sorting.
 * @property offset Offset needed to return a specific subset of topics.
 * @property count Number of topics to return.
 * @property preview '1' — to return the first comment in each topic,, '2' — to return the last comment in each topic,, '0' — to return no comments. By default: '0'.
 * @property previewLength Number of characters after which to truncate the previewed comment. To preview the full comment, specify '0'.
 */
data class BoardGetTopics(
    var groupId: Long,
    var topicIds: List<Long>? = null,
    var order: GetTopicsOrder? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var preview: GetTopicsPreview? = null,
    var previewLength: Long? = null
) : VkMethod<GetTopicsResponse>("board.getTopics", jacksonTypeRef()),
    UserServiceMethod
