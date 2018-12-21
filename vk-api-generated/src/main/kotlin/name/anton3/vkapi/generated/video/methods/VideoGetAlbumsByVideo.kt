@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod

/**
 * [https://vk.com/dev/video.getAlbumsByVideo]
 *
 * No description
 *
 * @property targetId No description
 * @property ownerId No description
 * @property videoId No description
 */
data class VideoGetAlbumsByVideo(
    var targetId: Long? = null,
    var ownerId: Long,
    var videoId: Long
) : VkMethod<List<Long>>("video.getAlbumsByVideo", jacksonTypeRef())
