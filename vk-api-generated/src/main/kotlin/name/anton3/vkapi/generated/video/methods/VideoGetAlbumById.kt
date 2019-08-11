@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.video.objects.VideoAlbumFull
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/video.getAlbumById]
 *
 * Returns video album info
 *
 * @property ownerId identifier of a user or community to add a video to. Use a negative value to designate a community ID.
 * @property albumId Album ID.
 */
data class VideoGetAlbumById(
    var ownerId: Int? = null,
    var albumId: Int
) : CheckedMethod<VideoAlbumFull, UserMethod>("video.getAlbumById", jacksonTypeRef())
