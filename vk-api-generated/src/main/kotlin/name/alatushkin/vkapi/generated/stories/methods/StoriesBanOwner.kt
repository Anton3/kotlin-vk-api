@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/stories.banOwner]
 *
 * Allows to hide stories from chosen sources from current user's feed.
 *
 * @property ownersIds List of sources IDs
 */
data class StoriesBanOwner(
    var ownersIds: List<Long>
) : VkMethod<OkResponse>("stories.banOwner", jacksonTypeRef()),
    UserMethod
