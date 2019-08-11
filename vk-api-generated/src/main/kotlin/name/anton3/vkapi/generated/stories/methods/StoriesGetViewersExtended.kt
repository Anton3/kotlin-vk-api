@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.users.objects.UserFull
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/stories.getViewers]
 *
 * Returns a list of story viewers.
 *
 * @property ownerId Story owner ID.
 * @property storyId Story ID.
 * @property count Maximum number of results.
 * @property offset Offset needed to return a specific subset of results.
 */
data class StoriesGetViewersExtended(
    var ownerId: Int,
    var storyId: Int,
    var count: Int? = null,
    var offset: Int? = null
) : CheckedMethod<VkList<UserFull>, UserGroupMethod>("stories.getViewers", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
