@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.restore]
 *
 * Restores a previously deleted video.
 *
 * @property videoId Video ID.
 * @property ownerId ID of the user or community that owns the video.
 */
data class VideoRestore(
    var videoId: Int,
    var ownerId: Int? = null
) : VkMethod<OkResponse, UserMethod>("video.restore", jacksonTypeRef())
