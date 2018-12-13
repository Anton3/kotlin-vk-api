@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

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
    var targetId: Long? = null,
    var videoId: Long,
    var ownerId: Long
) : VkMethod<OkResponse>(
    "video.add",
    jacksonTypeRef()
), UserMethod
