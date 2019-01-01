@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.video.objects.GetCatalogSectionExtendedResponse
import name.anton3.vkapi.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/video.getCatalogSection]
 *
 * Returns a separate catalog section
 *
 * @property sectionId 'id' value returned with a block by the '' method.
 * @property from 'next' value returned with a block by the '' method.
 * @property count number of blocks to return.
 */
data class VideoGetCatalogSectionExtended(
    var sectionId: String,
    var from: String,
    var count: Int? = null
) : VkMethod<GetCatalogSectionExtendedResponse>("video.getCatalogSection", jacksonTypeRef()),
    UserServiceMethod {
    init {
        unsafeParam("extended", "1")
    }
}
