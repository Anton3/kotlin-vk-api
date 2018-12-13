@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/stories.unbanOwner]
 *
 * Allows to show stories from hidden sources in current user's feed.
 *
 * @property ownersIds List of hidden sources to show stories from.
 */
data class StoriesUnbanOwner(
    var ownersIds: List<Long>
) : VkMethod<OkResponse>(
    "stories.unbanOwner",
    jacksonTypeRef()
), UserMethod
