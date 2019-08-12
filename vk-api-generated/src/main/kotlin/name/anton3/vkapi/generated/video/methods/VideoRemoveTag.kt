@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.removeTag]
 *
 * Removes a tag from a video.
 *
 * @property tagId Tag ID.
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 */
data class VideoRemoveTag(
    var tagId: Int,
    var ownerId: Int? = null,
    var videoId: Int
) : VkMethod<OkResponse, UserMethod>("video.removeTag", jacksonTypeRef())
