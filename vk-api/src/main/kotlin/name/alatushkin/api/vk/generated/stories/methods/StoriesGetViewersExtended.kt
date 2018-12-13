@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.users.objects.UserFull
import name.alatushkin.api.vk.tokens.UserGroupMethod
import name.alatushkin.api.vk.vktypes.VkList

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
    var ownerId: Long,
    var storyId: Long,
    var count: Long? = null,
    var offset: Long? = null
) : VkMethod<VkList<UserFull>>(
    "stories.getViewers",
    jacksonTypeRef()
), UserGroupMethod {
    init {
        unsafeParam("extended", "1")
    }
}
