@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.NameCase
import name.anton3.vkapi.generated.newsfeed.objects.GetBannedExtendedResponse
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/newsfeed.getBanned]
 *
 * Returns a list of users and communities banned from the current user's newsfeed.
 *
 * @property fields Profile fields to return.
 * @property nameCase Case for declension of user name and surname: 'nom' — nominative (default), 'gen' — genitive , 'dat' — dative, 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
data class NewsfeedGetBannedExtended(
    var fields: List<String>? = null,
    var nameCase: NameCase? = null
) : VkMethod<GetBannedExtendedResponse, UserMethod>("newsfeed.getBanned", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
