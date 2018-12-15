@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.board.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

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
    var groupId: Long,
    var topicId: Long,
    var title: String
) : VkMethod<OkResponse>("board.editTopic", jacksonTypeRef()),
    UserMethod
