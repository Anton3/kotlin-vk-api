@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.MethodRequirement
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.addToAlbum]
 *
 * No description
 *
 * @property targetId No description
 * @property albumId No description
 * @property albumIds No description
 * @property ownerId No description
 * @property videoId No description
 */
data class VideoAddToAlbum(
    var targetId: Int? = null,
    var albumId: Int? = null,
    var albumIds: List<Int>? = null,
    var ownerId: Int,
    var videoId: Int
) : CheckedMethod<OkResponse, MethodRequirement>("video.addToAlbum", jacksonTypeRef())
