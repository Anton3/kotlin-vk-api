@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.polls.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.polls.objects.CreateBackgroundId
import name.anton3.vkapi.generated.polls.objects.Poll
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/polls.create]
 *
 * Creates polls that can be attached to the users' or communities' posts.
 *
 * @property question question text
 * @property isAnonymous '1' – anonymous poll, participants list is hidden,, '0' – public poll, participants list is available,, Default value is '0'.
 * @property isMultiple No description
 * @property endDate No description
 * @property ownerId If a poll will be added to a communty it is required to send a negative group identifier. Current user by default.
 * @property addAnswers available answers list, for example: " ["yes","no","maybe"]", There can be from 1 to 10 answers.
 * @property photoId No description
 * @property backgroundId No description
 */
data class PollsCreate(
    var question: String? = null,
    var isAnonymous: Boolean? = null,
    var isMultiple: Boolean? = null,
    var endDate: Int? = null,
    var ownerId: Int? = null,
    var addAnswers: String? = null,
    var photoId: Int? = null,
    var backgroundId: CreateBackgroundId? = null
) : VkMethod<Poll, UserMethod>("polls.create", jacksonTypeRef())
