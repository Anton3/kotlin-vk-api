@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.hideCatalogSection]
 *
 * Hides a video catalog section from a user.
 *
 * @property sectionId 'id' value returned with a block to hide by the '' method.
 */
data class VideoHideCatalogSection(
    var sectionId: Long
) : VkMethod<OkResponse>("video.hideCatalogSection", jacksonTypeRef()),
    UserMethod
