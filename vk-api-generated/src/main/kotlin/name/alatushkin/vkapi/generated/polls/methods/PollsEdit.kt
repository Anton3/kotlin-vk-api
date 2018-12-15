@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.polls.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

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
 */
data class PollsEdit(
    var ownerId: Long,
    var pollId: Long,
    var question: String? = null,
    var addAnswers: String? = null,
    var editAnswers: String? = null,
    var deleteAnswers: String? = null
) : VkMethod<OkResponse>("polls.edit", jacksonTypeRef()),
    UserMethod
