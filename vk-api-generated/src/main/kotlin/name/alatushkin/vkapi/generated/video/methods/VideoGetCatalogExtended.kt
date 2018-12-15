@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.video.objects.GetCatalogExtendedResponse
import name.alatushkin.vkapi.tokens.UserServiceMethod

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
    var count: Long? = null,
    var itemsCount: Long? = null,
    var from: String? = null,
    var filters: List<String>? = null
) : VkMethod<GetCatalogExtendedResponse>("video.getCatalog", jacksonTypeRef()),
    UserServiceMethod {
    init {
        unsafeParam("extended", "1")
    }
}
