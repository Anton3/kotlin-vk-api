@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.board.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/board.unfixTopic]
 *
 * Unpins a pinned topic from the top of a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 */
data class BoardUnfixTopic(
    var groupId: Long,
    var topicId: Long
) : VkMethod<OkResponse>("board.unfixTopic", jacksonTypeRef()),
    UserMethod
