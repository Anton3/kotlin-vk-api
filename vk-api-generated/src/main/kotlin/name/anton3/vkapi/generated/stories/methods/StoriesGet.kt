@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.stories.objects.Story
import name.anton3.vkapi.tokens.UserGroupMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/stories.get]
 *
 * Returns stories available for current user.
 *
 * @property ownerId Owner ID.
 */
data class StoriesGet(
    var ownerId: Int? = null
) : VkMethod<VkList<List<Story>>>("stories.get", jacksonTypeRef()),
    UserGroupMethod
