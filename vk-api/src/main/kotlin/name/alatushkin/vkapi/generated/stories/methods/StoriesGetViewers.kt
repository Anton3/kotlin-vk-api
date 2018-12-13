@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserGroupMethod
import name.alatushkin.vkapi.vktypes.VkList

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
data class StoriesGetViewers(
    var ownerId: Long,
    var storyId: Long,
    var count: Long? = null,
    var offset: Long? = null
) : VkMethod<VkList<Long>>(
    "stories.getViewers",
    jacksonTypeRef()
), UserGroupMethod
