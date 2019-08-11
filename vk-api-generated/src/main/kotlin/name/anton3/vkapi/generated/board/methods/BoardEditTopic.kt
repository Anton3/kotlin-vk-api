@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.board.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/board.editTopic]
 *
 * Edits the title of a topic on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 * @property title New title of the topic.
 */
data class BoardEditTopic(
    var groupId: Int,
    var topicId: Int,
    var title: String
) : CheckedMethod<OkResponse, UserMethod>("board.editTopic", jacksonTypeRef())
