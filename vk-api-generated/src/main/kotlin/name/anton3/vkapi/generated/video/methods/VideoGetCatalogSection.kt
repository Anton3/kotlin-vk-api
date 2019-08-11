@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.video.objects.GetCatalogSectionResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserServiceMethod

/**
 * [https://vk.com/dev/video.getCatalogSection]
 *
 * Returns a separate catalog section
 *
 * @property sectionId 'id' value returned with a block by the '' method.
 * @property from 'next' value returned with a block by the '' method.
 * @property count number of blocks to return.
 */
data class VideoGetCatalogSection(
    var sectionId: String,
    var from: String,
    var count: Int? = null
) : CheckedMethod<GetCatalogSectionResponse, UserServiceMethod>("video.getCatalogSection", jacksonTypeRef())
