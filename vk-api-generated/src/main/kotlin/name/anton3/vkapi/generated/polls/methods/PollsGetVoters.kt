@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.polls.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.common.objects.NameCase
import name.anton3.vkapi.generated.polls.objects.Voters
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/polls.getVoters]
 *
 * Returns a list of IDs of users who selected specific answers in the poll.
 *
 * @property ownerId ID of the user or community that owns the poll. Use a negative value to designate a community ID.
 * @property pollId Poll ID.
 * @property answerIds Answer IDs.
 * @property isBoard No description
 * @property friendsOnly '1' — to return only current user's friends, '0' — to return all users (default),
 * @property offset Offset needed to return a specific subset of voters. '0' — (default)
 * @property count Number of user IDs to return (if the 'friends_only' parameter is not set, maximum '1000', otherwise '10'). '100' — (default)
 * @property fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate (birthdate)', 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online', 'counters'.
 * @property nameCase Case for declension of user name and surname: , 'nom' — nominative (default) , 'gen' — genitive , 'dat' — dative , 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
data class PollsGetVoters(
    var ownerId: Long? = null,
    var pollId: Long,
    var answerIds: List<Long>,
    var isBoard: Boolean? = null,
    var friendsOnly: Boolean? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var fields: List<String>? = null,
    var nameCase: NameCase? = null
) : VkMethod<List<Voters>>("polls.getVoters", jacksonTypeRef()),
    UserMethod
