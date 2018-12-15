@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.reorderVideos]
 *
 * Reorders the video in the video album.
 *
 * @property targetId ID of the user or community that owns the album with videos.
 * @property albumId ID of the video album.
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId ID of the video.
 * @property beforeOwnerId ID of the user or community that owns the video before which the video in question shall be placed.
 * @property beforeVideoId ID of the video before which the video in question shall be placed.
 * @property afterOwnerId ID of the user or community that owns the video after which the photo in question shall be placed.
 * @property afterVideoId ID of the video after which the photo in question shall be placed.
 */
data class VideoReorderVideos(
    var targetId: Long? = null,
    var albumId: Long? = null,
    var ownerId: Long,
    var videoId: Long,
    var beforeOwnerId: Long? = null,
    var beforeVideoId: Long? = null,
    var afterOwnerId: Long? = null,
    var afterVideoId: Long? = null
) : VkMethod<OkResponse>("video.reorderVideos", jacksonTypeRef()),
    UserMethod
