@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.video.objects.VideoAlbumFull
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/video.getAlbumById]
 *
 * Returns video album info
 *
 * @property ownerId identifier of a user or community to add a video to. Use a negative value to designate a community ID.
 * @property albumId Album ID.
 */
data class VideoGetAlbumById(
    var ownerId: Long? = null,
    var albumId: Long
) : VkMethod<VideoAlbumFull>("video.getAlbumById", jacksonTypeRef()),
    UserMethod
