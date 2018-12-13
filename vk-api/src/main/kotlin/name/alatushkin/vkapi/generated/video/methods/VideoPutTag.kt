@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/video.putTag]
 *
 * Adds a tag on a video.
 *
 * @property userId ID of the user to be tagged.
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 * @property taggedName Tag text.
 */
data class VideoPutTag(
    var userId: Long,
    var ownerId: Long? = null,
    var videoId: Long,
    var taggedName: String? = null
) : VkMethod<Long>(
    "video.putTag",
    jacksonTypeRef()
), UserMethod
