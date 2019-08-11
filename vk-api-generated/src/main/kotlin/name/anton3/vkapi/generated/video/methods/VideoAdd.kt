@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.add]
 *
 * Adds a video to a user or community page.
 *
 * @property targetId identifier of a user or community to add a video to. Use a negative value to designate a community ID.
 * @property videoId Video ID.
 * @property ownerId ID of the user or community that owns the video. Use a negative value to designate a community ID.
 */
data class VideoAdd(
    var targetId: Int? = null,
    var videoId: Int,
    var ownerId: Int
) : CheckedMethod<OkResponse, UserMethod>("video.add", jacksonTypeRef())
