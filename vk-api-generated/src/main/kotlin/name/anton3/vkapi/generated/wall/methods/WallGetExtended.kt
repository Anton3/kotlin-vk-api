@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.wall.objects.GetExtendedResponse
import name.anton3.vkapi.generated.wall.objects.GetFilter
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserServiceMethod

/**
 * [https://vk.com/dev/wall.get]
 *
 * Returns a list of posts on a user wall or community wall.
 *
 * @property ownerId ID of the user or community that owns the wall. By default, current user ID. Use a negative value to designate a community ID.
 * @property domain User or community short address.
 * @property offset Offset needed to return a specific subset of posts.
 * @property count Number of posts to return (maximum 100).
 * @property filter Filter to apply: 'owner' — posts by the wall owner, 'others' — posts by someone else, 'all' — posts by the wall owner and others (default), 'postponed' — timed posts (only available for calls with an 'access_token'), 'suggests' — suggested posts on a community wall
 * @property fields No description
 */
data class WallGetExtended(
    var ownerId: Int? = null,
    var domain: String? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var filter: GetFilter? = null,
    var fields: List<String>? = null
) : CheckedMethod<GetExtendedResponse, UserServiceMethod>("wall.get", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
