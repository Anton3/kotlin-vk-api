@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.delete]
 *
 * Deletes a video from a user or community page.
 *
 * @property videoId Video ID.
 * @property ownerId ID of the user or community that owns the video.
 * @property targetId No description
 */
data class VideoDelete(
    var videoId: Int,
    var ownerId: Int? = null,
    var targetId: Int? = null
) : VkMethod<OkResponse>("video.delete", jacksonTypeRef()),
    UserMethod
