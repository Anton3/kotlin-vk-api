@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.newsfeed.GetBannedExtendedResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.getBanned]
 *
 * Returns a list of users and communities banned from the current user's newsfeed.
 *
 * @property fields Profile fields to return.
 * @property nameCase Case for declension of user name and surname: 'nom' — nominative (default), 'gen' — genitive , 'dat' — dative, 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class NewsfeedGetBannedMethodExtended(
        fields: Array<String>? = null,
        nameCase: NameCase? = null
) : VkMethod<GetBannedExtendedResponse>(
    "newsfeed.getBanned",
    mutableMapOf("extended" to "1"),
    object : TypeReference<VkSuccess<GetBannedExtendedResponse>>() {}
), UserMethod {

    var fields: Array<String>? by props
    var nameCase: NameCase? by props

    init {
        this.fields = fields
        this.nameCase = nameCase
    }

    fun setFields(fields: Array<String>): NewsfeedGetBannedMethodExtended {
        this.fields = fields
        return this
    }

    fun setNameCase(nameCase: NameCase): NewsfeedGetBannedMethodExtended {
        this.nameCase = nameCase
        return this
    }
}
