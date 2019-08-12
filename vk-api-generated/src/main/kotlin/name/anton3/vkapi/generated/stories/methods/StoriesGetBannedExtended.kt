@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.stories.objects.GetBannedExtendedResponse
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/stories.getBanned]
 *
 * Returns list of sources hidden from current user's feed.
 *
 * @property fields Additional fields to return
 */
data class StoriesGetBannedExtended(
    var fields: List<String>? = null
) : VkMethod<GetBannedExtendedResponse, UserMethod>("stories.getBanned", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
