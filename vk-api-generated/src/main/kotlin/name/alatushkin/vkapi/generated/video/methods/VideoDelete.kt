@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.delete]
 *
 * Deletes a video from a user or community page.
 *
 * @property videoId Video ID.
 * @property ownerId ID of the user or community that owns the video.
 * @property targetId No description
 */
data class VideoDelete(
    var videoId: Long,
    var ownerId: Long? = null,
    var targetId: Long? = null
) : VkMethod<OkResponse>("video.delete", jacksonTypeRef()),
    UserMethod
