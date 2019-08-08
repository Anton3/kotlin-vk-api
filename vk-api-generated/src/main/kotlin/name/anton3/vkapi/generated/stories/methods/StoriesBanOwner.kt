@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/stories.banOwner]
 *
 * Allows to hide stories from chosen sources from current user's feed.
 *
 * @property ownersIds List of sources IDs
 */
data class StoriesBanOwner(
    var ownersIds: List<Int>
) : VkMethod<OkResponse>("stories.banOwner", jacksonTypeRef()),
    UserMethod
