@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod

/**
 * [https://vk.com/dev/video.getAlbumsByVideo]
 *
 * null
 *
 * @property targetId 
 * @property ownerId 
 * @property videoId 
 */
data class VideoGetAlbumsByVideo(
    var targetId: Long? = null,
    var ownerId: Long,
    var videoId: Long
) : VkMethod<List<Long>>(
    "video.getAlbumsByVideo",
    jacksonTypeRef()
)
