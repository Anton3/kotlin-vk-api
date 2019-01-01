@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.stories.objects.GetExtendedResponse
import name.anton3.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.get]
 *
 * Returns stories available for current user.
 *
 * @property ownerId Owner ID.
 */
data class StoriesGetExtended(
    var ownerId: Int? = null
) : VkMethod<GetExtendedResponse>("stories.get", jacksonTypeRef()),
    UserGroupMethod {
    init {
        unsafeParam("extended", "1")
    }
}
