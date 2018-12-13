@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.video.objects.VideoAlbumFull
import name.alatushkin.vkapi.vktypes.VkList

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
