@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.newsfeed.objects.SearchExtendedResponse
import name.alatushkin.vkapi.tokens.UserServiceMethod

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
data class NewsfeedSearchExtended(
    var q: String? = null,
    var count: Long? = null,
    var latitude: Double? = null,
    var longitude: Double? = null,
    var startTime: Long? = null,
    var endTime: Long? = null,
    var startFrom: String? = null,
    var fields: List<String>? = null
) : VkMethod<SearchExtendedResponse>("newsfeed.search", jacksonTypeRef()),
    UserServiceMethod {
    init {
        unsafeParam("extended", "1")
    }
}
