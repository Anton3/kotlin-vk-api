@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/stories.getBanned]
 *
 * Returns list of sources hidden from current user's feed.
 *
 * @property fields Additional fields to return
 */
data class StoriesGetBanned(
    var fields: List<String>? = null
) : VkMethod<VkList<Int>>("stories.getBanned", jacksonTypeRef()),
    UserMethod
