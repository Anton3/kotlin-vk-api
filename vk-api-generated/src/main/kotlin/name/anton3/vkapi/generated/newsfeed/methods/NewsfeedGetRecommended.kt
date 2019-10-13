@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.UserGroupFields
import name.anton3.vkapi.generated.newsfeed.objects.GetRecommendedResponse
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

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
    var startTime: Int? = null,
    var endTime: Int? = null,
    var maxPhotos: Int? = null,
    var startFrom: String? = null,
    var count: Int? = null,
    var fields: List<UserGroupFields>? = null
) : VkMethod<GetRecommendedResponse, UserMethod>("newsfeed.getRecommended", jacksonTypeRef())
