@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
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
    var tagId: Long,
    var ownerId: Long? = null,
    var videoId: Long
) : VkMethod<OkResponse>("video.removeTag", jacksonTypeRef()),
    UserMethod
