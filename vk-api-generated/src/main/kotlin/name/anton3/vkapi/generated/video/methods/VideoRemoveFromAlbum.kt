@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
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
    var targetId: Int? = null,
    var albumId: Int? = null,
    var albumIds: List<Int>? = null,
    var ownerId: Int,
    var videoId: Int
) : VkMethod<OkResponse>("video.removeFromAlbum", jacksonTypeRef())
