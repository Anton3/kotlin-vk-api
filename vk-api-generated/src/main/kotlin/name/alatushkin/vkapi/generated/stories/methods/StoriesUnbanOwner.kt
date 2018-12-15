@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/stories.unbanOwner]
 *
 * Allows to show stories from hidden sources in current user's feed.
 *
 * @property ownersIds List of hidden sources to show stories from.
 */
data class StoriesUnbanOwner(
    var ownersIds: List<Long>
) : VkMethod<OkResponse>("stories.unbanOwner", jacksonTypeRef()),
    UserMethod
