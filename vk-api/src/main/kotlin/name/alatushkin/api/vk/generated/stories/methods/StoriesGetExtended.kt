@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.stories.objects.GetExtendedResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.get]
 *
 * Returns stories available for current user.
 *
 * @property ownerId Owner ID.
 */
data class StoriesGetExtended(
    var ownerId: Long? = null
) : VkMethod<GetExtendedResponse>(
    "stories.get",
    jacksonTypeRef()
), UserGroupMethod {
    init {
        unsafeParam("extended", "1")
    }
}
