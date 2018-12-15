@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.newsfeed.objects.GetRecommendedResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.getRecommended]
 *
 * , Returns a list of newsfeeds recommended to the current user.
 *
 * @property startTime Earliest timestamp (in Unix time) of a news item to return. By default, 24 hours ago.
 * @property endTime Latest timestamp (in Unix time) of a news item to return. By default, the current time.
 * @property maxPhotos Maximum number of photos to return. By default, '5'.
 * @property startFrom 'new_from' value obtained in previous call.
 * @property count Number of news items to return.
 * @property fields Additional fields of [vk.com/dev/fields|profiles] and [vk.com/dev/fields_groups|communities] to return.
 */
data class NewsfeedGetRecommended(
    var startTime: Long? = null,
    var endTime: Long? = null,
    var maxPhotos: Long? = null,
    var startFrom: String? = null,
    var count: Long? = null,
    var fields: List<String>? = null
) : VkMethod<GetRecommendedResponse>("newsfeed.getRecommended", jacksonTypeRef()),
    UserMethod
