@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.newsfeed.objects.SearchResponse
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/newsfeed.search]
 *
 * Returns search results by statuses.
 *
 * @property q Search query string (e.g., 'New Year').
 * @property count Number of posts to return.
 * @property latitude Geographical latitude point (in degrees, -90 to 90) within which to search.
 * @property longitude Geographical longitude point (in degrees, -180 to 180) within which to search.
 * @property startTime Earliest timestamp (in Unix time) of a news item to return. By default, 24 hours ago.
 * @property endTime Latest timestamp (in Unix time) of a news item to return. By default, the current time.
 * @property startFrom No description
 * @property fields Additional fields of [vk.com/dev/fields|profiles] and [vk.com/dev/fields_groups|communities] to return.
 */
data class NewsfeedSearch(
    var q: String? = null,
    var count: Int? = null,
    var latitude: Double? = null,
    var longitude: Double? = null,
    var startTime: Int? = null,
    var endTime: Int? = null,
    var startFrom: String? = null,
    var fields: List<String>? = null
) : VkMethod<SearchResponse, UserServiceMethod>("newsfeed.search", jacksonTypeRef())
