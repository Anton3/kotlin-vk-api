@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.video.objects.VideoAlbumFull
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/video.getAlbumsByVideo]
 *
 * No description
 *
 * @property targetId No description
 * @property ownerId No description
 * @property videoId No description
 */
data class VideoGetAlbumsByVideoExtended(
    var targetId: Int? = null,
    var ownerId: Int,
    var videoId: Int
) : VkMethod<VkList<VideoAlbumFull>>("video.getAlbumsByVideo", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
