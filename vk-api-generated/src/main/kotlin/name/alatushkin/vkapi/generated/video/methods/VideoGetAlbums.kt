@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.video.objects.VideoAlbumFull
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/video.getAlbums]
 *
 * Returns a list of video albums owned by a user or community.
 *
 * @property ownerId ID of the user or community that owns the video album(s).
 * @property offset Offset needed to return a specific subset of video albums.
 * @property count Number of video albums to return.
 */
data class VideoGetAlbums(
    var ownerId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<VideoAlbumFull>>("video.getAlbums", jacksonTypeRef()),
    UserMethod
