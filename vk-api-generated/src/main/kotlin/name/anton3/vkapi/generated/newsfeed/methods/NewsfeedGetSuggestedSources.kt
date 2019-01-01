@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.newsfeed.objects.GetSuggestedSourcesResponse
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

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
    var offset: Int? = null,
    var count: Int? = null,
    var shuffle: Boolean? = null,
    var fields: List<String>? = null
) : VkMethod<VkList<GetSuggestedSourcesResponse>>("newsfeed.getSuggestedSources", jacksonTypeRef()),
    UserMethod
