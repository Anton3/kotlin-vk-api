@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.video.objects.VideoAlbumFull
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

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
    var ownerId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<VideoAlbumFull>>(
    "video.getAlbums",
    jacksonTypeRef()
), UserMethod {
    init {
        unsafeParam("extended", "1")
    }
}
