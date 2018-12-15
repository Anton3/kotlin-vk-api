@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.restore]
 *
 * Restores a previously deleted video.
 *
 * @property videoId Video ID.
 * @property ownerId ID of the user or community that owns the video.
 */
data class VideoRestore(
    var videoId: Long,
    var ownerId: Long? = null
) : VkMethod<OkResponse>("video.restore", jacksonTypeRef()),
    UserMethod
