@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.video.objects.VideoAlbumFull
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/video.getAlbumsByVideo]
 *
 * null
 *
 * @property targetId 
 * @property ownerId 
 * @property videoId 
 */
data class VideoGetAlbumsByVideoExtended(
    var targetId: Long? = null,
    var ownerId: Long,
    var videoId: Long
) : VkMethod<VkList<VideoAlbumFull>>(
    "video.getAlbumsByVideo",
    jacksonTypeRef()
) {
    init {
        unsafeParam("extended", "1")
    }
}
