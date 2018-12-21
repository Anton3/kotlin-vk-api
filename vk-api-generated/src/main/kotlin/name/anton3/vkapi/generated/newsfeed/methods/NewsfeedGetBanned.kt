@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.common.objects.NameCase
import name.anton3.vkapi.generated.newsfeed.objects.GetBannedResponse
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.getBanned]
 *
 * Returns a list of users and communities banned from the current user's newsfeed.
 *
 * @property fields Profile fields to return.
 * @property nameCase Case for declension of user name and surname: 'nom' — nominative (default), 'gen' — genitive , 'dat' — dative, 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
data class NewsfeedGetBanned(
    var fields: List<String>? = null,
    var nameCase: NameCase? = null
) : VkMethod<GetBannedResponse>("newsfeed.getBanned", jacksonTypeRef()),
    UserMethod
