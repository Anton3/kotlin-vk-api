@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.video.objects.VideoTagInfo
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/video.getNewTags]
 *
 * Returns a list of videos with tags that have not been viewed.
 *
 * @property offset Offset needed to return a specific subset of videos.
 * @property count Number of videos to return.
 */
data class VideoGetNewTags(
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<VideoTagInfo>>(
    "video.getNewTags",
    jacksonTypeRef()
), UserMethod
