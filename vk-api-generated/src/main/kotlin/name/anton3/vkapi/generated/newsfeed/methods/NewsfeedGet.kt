@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.newsfeed.objects.GetResponse
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/newsfeed.get]
 *
 * Returns data required to show newsfeed for the current user.
 *
 * @property filters Filters to apply: 'post' — new wall posts, 'photo' — new photos, 'photo_tag' — new photo tags, 'wall_photo' — new wall photos, 'friend' — new friends, 'note' — new notes
 * @property returnBanned '1' — to return news items from banned sources
 * @property startTime Earliest timestamp (in Unix time) of a news item to return. By default, 24 hours ago.
 * @property endTime Latest timestamp (in Unix time) of a news item to return. By default, the current time.
 * @property maxPhotos Maximum number of photos to return. By default, '5'.
 * @property sourceIds Sources to obtain news from, separated by commas. User IDs can be specified in formats '' or 'u' , where '' is the user's friend ID. Community IDs can be specified in formats '-' or 'g' , where '' is the community ID. If the parameter is not set, all of the user's friends and communities are returned, except for banned sources, which can be obtained with the [vk.com/dev/newsfeed.getBanned|newsfeed.getBanned] method.
 * @property startFrom identifier required to get the next page of results. Value for this parameter is returned in 'next_from' field in a reply.
 * @property count Number of news items to return (default 50, maximum 100). For auto feed, you can use the 'new_offset' parameter returned by this method.
 * @property fields Additional fields of [vk.com/dev/fields|profiles] and [vk.com/dev/fields_groups|communities] to return.
 */
data class NewsfeedGet(
    var filters: List<String>? = null,
    var returnBanned: Boolean? = null,
    var startTime: Int? = null,
    var endTime: Int? = null,
    var maxPhotos: Int? = null,
    var sourceIds: List<String>? = null,
    var startFrom: String? = null,
    var count: Int? = null,
    var fields: List<String>? = null
) : VkMethod<GetResponse, UserMethod>("newsfeed.get", jacksonTypeRef())
