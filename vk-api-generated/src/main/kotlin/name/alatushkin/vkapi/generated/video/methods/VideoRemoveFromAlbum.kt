@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

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
