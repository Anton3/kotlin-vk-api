@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.stories.objects.Story
import name.alatushkin.api.vk.tokens.UserGroupMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/stories.get]
 *
 * Returns stories available for current user.
 *
 * @property ownerId Owner ID.
 */
data class StoriesGet(
    var ownerId: Long? = null
) : VkMethod<VkList<List<Story>>>(
    "stories.get",
    jacksonTypeRef()
), UserGroupMethod
