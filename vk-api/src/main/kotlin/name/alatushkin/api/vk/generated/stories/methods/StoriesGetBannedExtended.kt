@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.stories.objects.GetBannedExtendedResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/stories.getBanned]
 *
 * Returns list of sources hidden from current user's feed.
 *
 * @property fields Additional fields to return
 */
data class StoriesGetBannedExtended(
    var fields: List<String>? = null
) : VkMethod<GetBannedExtendedResponse>(
    "stories.getBanned",
    jacksonTypeRef()
), UserMethod {
    init {
        unsafeParam("extended", "1")
    }
}
