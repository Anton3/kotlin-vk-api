@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse

/**
 * [https://vk.com/dev/video.addToAlbum]
 *
 * null
 *
 * @property targetId 
 * @property albumId 
 * @property albumIds 
 * @property ownerId 
 * @property videoId 
 */
data class VideoAddToAlbum(
    var targetId: Long? = null,
    var albumId: Long? = null,
    var albumIds: List<Long>? = null,
    var ownerId: Long,
    var videoId: Long
) : VkMethod<OkResponse>(
    "video.addToAlbum",
    jacksonTypeRef()
)
