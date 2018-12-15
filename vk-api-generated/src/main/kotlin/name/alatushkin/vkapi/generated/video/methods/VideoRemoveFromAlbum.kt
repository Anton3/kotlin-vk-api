@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.removeFromAlbum]
 *
 * No description
 *
 * @property targetId No description
 * @property albumId No description
 * @property albumIds No description
 * @property ownerId No description
 * @property videoId No description
 */
data class VideoRemoveFromAlbum(
    var targetId: Long? = null,
    var albumId: Long? = null,
    var albumIds: List<Long>? = null,
    var ownerId: Long,
    var videoId: Long
) : VkMethod<OkResponse>("video.removeFromAlbum", jacksonTypeRef())
