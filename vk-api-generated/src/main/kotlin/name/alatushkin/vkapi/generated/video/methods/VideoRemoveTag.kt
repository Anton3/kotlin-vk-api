@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

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
