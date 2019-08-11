@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.board.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/board.closeTopic]
 *
 * Closes a topic on a community's discussion board so that comments cannot be posted.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 */
data class BoardCloseTopic(
    var groupId: Int,
    var topicId: Int
) : CheckedMethod<OkResponse, UserMethod>("board.closeTopic", jacksonTypeRef())
