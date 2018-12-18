@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.video.objects.Video
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/video.getUserVideos]
 *
 * Returns list of videos in which the user is tagged.
 *
 * @property userId User ID.
 * @property offset Offset needed to return a specific subset of videos.
 * @property count Number of videos to return.
 */
data class VideoGetUserVideos(
    var userId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<Video>>("video.getUserVideos", jacksonTypeRef()),
    UserMethod
