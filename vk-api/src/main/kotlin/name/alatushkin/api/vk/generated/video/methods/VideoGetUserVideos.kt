@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.video.objects.Video
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

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
) : VkMethod<VkList<Video>>(
    "video.getUserVideos",
    jacksonTypeRef()
), UserMethod
