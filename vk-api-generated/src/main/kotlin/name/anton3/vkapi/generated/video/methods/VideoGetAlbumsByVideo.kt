@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod

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
    var targetId: Int? = null,
    var ownerId: Int,
    var videoId: Int
) : VkMethod<List<Int>>("video.getAlbumsByVideo", jacksonTypeRef())
