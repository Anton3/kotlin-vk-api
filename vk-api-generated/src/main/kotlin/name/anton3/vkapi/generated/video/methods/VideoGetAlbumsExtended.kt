@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.video.objects.VideoAlbumFull
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/video.getAlbums]
 *
 * Returns a list of video albums owned by a user or community.
 *
 * @property ownerId ID of the user or community that owns the video album(s).
 * @property offset Offset needed to return a specific subset of video albums.
 * @property count Number of video albums to return.
 */
data class VideoGetAlbumsExtended(
    var ownerId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<VkList<VideoAlbumFull>, UserMethod>("video.getAlbums", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
