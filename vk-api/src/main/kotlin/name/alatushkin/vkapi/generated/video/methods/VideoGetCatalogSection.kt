@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.video.objects.GetCatalogSectionResponse
import name.alatushkin.vkapi.tokens.UserServiceMethod

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
    var count: Long? = null
) : VkMethod<GetCatalogSectionResponse>(
    "video.getCatalogSection",
    jacksonTypeRef()
), UserServiceMethod
