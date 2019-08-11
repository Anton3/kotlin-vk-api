@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.wall.objects.SearchExtendedResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserServiceMethod

/**
 * [https://vk.com/dev/wall.search]
 *
 * Allows to search posts on user or community walls.
 *
 * @property ownerId user or community id. "Remember that for a community 'owner_id' must be negative."
 * @property domain user or community screen name.
 * @property query search query string.
 * @property ownersOnly '1' – returns only page owner's posts.
 * @property count count of posts to return.
 * @property offset Offset needed to return a specific subset of posts.
 * @property fields No description
 */
data class WallSearchExtended(
    var ownerId: Int? = null,
    var domain: String? = null,
    var query: String? = null,
    var ownersOnly: Boolean? = null,
    var count: Int? = null,
    var offset: Int? = null,
    var fields: List<String>? = null
) : CheckedMethod<SearchExtendedResponse, UserServiceMethod>("wall.search", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
