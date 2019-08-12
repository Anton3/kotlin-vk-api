@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.video.objects.GetUserVideosExtendedResponse
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/video.getUserVideos]
 *
 * Returns list of videos in which the user is tagged.
 *
 * @property userId User ID.
 * @property offset Offset needed to return a specific subset of videos.
 * @property count Number of videos to return.
 */
data class VideoGetUserVideosExtended(
    var userId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<GetUserVideosExtendedResponse, UserMethod>("video.getUserVideos", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
