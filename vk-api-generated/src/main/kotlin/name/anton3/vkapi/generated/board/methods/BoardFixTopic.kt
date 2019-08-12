@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.board.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/board.fixTopic]
 *
 * Pins a topic (fixes its place) to the top of a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 */
data class BoardFixTopic(
    var groupId: Int,
    var topicId: Int
) : VkMethod<OkResponse, UserMethod>("board.fixTopic", jacksonTypeRef())
