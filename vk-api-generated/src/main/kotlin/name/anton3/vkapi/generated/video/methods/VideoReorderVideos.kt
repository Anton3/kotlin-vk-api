@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

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
    var targetId: Int? = null,
    var albumId: Int? = null,
    var ownerId: Int,
    var videoId: Int,
    var beforeOwnerId: Int? = null,
    var beforeVideoId: Int? = null,
    var afterOwnerId: Int? = null,
    var afterVideoId: Int? = null
) : CheckedMethod<OkResponse, UserMethod>("video.reorderVideos", jacksonTypeRef())
