@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.video.objects.GetCatalogResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserServiceMethod

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
data class VideoGetCatalog(
    var count: Int? = null,
    var itemsCount: Int? = null,
    var from: String? = null,
    var filters: List<String>? = null
) : CheckedMethod<GetCatalogResponse, UserServiceMethod>("video.getCatalog", jacksonTypeRef())
