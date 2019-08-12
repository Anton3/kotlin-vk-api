@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.board.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/board.deleteTopic]
 *
 * Deletes a topic from a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 */
data class BoardDeleteTopic(
    var groupId: Int,
    var topicId: Int
) : VkMethod<OkResponse, UserMethod>("board.deleteTopic", jacksonTypeRef())
