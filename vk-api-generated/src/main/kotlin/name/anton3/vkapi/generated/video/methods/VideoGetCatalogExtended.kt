@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.video.objects.GetCatalogExtendedResponse
import name.anton3.vkapi.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/video.getCatalog]
 *
 * Returns video catalog
 *
 * @property count number of catalog blocks to return.
 * @property itemsCount number of videos in each block.
 * @property from parameter for requesting the next results page. Value for transmitting here is returned in the 'next' field in a reply.
 * @property filters list of requested catalog sections
 */
data class VideoGetCatalogExtended(
    var count: Int? = null,
    var itemsCount: Int? = null,
    var from: String? = null,
    var filters: List<String>? = null
) : VkMethod<GetCatalogExtendedResponse>("video.getCatalog", jacksonTypeRef()),
    UserServiceMethod {
    init {
        unsafeParam("extended", "1")
    }
}
