@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.hideCatalogSection]
 *
 * Hides a video catalog section from a user.
 *
 * @property sectionId 'id' value returned with a block to hide by the '' method.
 */
data class VideoHideCatalogSection(
    var sectionId: Long
) : VkMethod<OkResponse>(
    "video.hideCatalogSection",
    jacksonTypeRef()
), UserMethod
