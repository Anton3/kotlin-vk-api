@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.newsfeed.objects.GetSuggestedSourcesResponse
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

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
data class NewsfeedGetSuggestedSources(
    var offset: Long? = null,
    var count: Long? = null,
    var shuffle: Boolean? = null,
    var fields: List<String>? = null
) : VkMethod<VkList<GetSuggestedSourcesResponse>>(
    "newsfeed.getSuggestedSources",
    jacksonTypeRef()
), UserMethod
