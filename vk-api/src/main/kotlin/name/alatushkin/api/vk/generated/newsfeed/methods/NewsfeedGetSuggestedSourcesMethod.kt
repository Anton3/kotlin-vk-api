@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.newsfeed.GetSuggestedSourcesResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.getSuggestedSources]
 *
 * Returns communities and users that current user is suggested to follow.
 *
 * @property offset offset required to choose a particular subset of communities or users.
 * @property count amount of communities or users to return.
 * @property shuffle shuffle the returned list or not.
 * @property fields list of extra fields to be returned. See available fields for [vk.com/dev/fields|users] and [vk.com/dev/fields_groups|communities].
 */
class NewsfeedGetSuggestedSourcesMethod(
    offset: Long? = null,
    count: Long? = null,
    shuffle: Boolean? = null,
    fields: Array<String>? = null
) : VkMethod<VkList<GetSuggestedSourcesResponse>>(
    "newsfeed.getSuggestedSources",
    mutableMapOf(),
    successReference()
), UserMethod {

    var offset: Long? by props
    var count: Long? by props
    var shuffle: Boolean? by props
    var fields: Array<String>? by props

    init {
        this.offset = offset
        this.count = count
        this.shuffle = shuffle
        this.fields = fields
    }
}
