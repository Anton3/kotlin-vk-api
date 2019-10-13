@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.polls.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.polls.objects.EditBackgroundId
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/polls.edit]
 *
 * Edits created polls
 *
 * @property ownerId poll owner id
 * @property pollId edited poll's id
 * @property question new question text
 * @property addAnswers answers list, for example: , "["yes","no","maybe"]"
 * @property editAnswers object containing answers that need to be edited,, key – answer id, value – new answer text. Example: {"382967099":"option1", "382967103":"option2"}"
 * @property deleteAnswers list of answer ids to be deleted. For example: "[382967099, 382967103]"
 * @property endDate No description
 * @property photoId No description
 * @property backgroundId No description
 */
data class PollsEdit(
    var ownerId: Int? = null,
    var pollId: Int,
    var question: String? = null,
    var addAnswers: String? = null,
    var editAnswers: String? = null,
    var deleteAnswers: String? = null,
    var endDate: Int? = null,
    var photoId: Int? = null,
    var backgroundId: EditBackgroundId? = null
) : VkMethod<OkResponse, UserMethod>("polls.edit", jacksonTypeRef())
