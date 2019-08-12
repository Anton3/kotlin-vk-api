@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.hideCatalogSection]
 *
 * Hides a video catalog section from a user.
 *
 * @property sectionId 'id' value returned with a block to hide by the '' method.
 */
data class VideoHideCatalogSection(
    var sectionId: Int
) : VkMethod<OkResponse, UserMethod>("video.hideCatalogSection", jacksonTypeRef())
