@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.video.objects.Video
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/fave.getVideos]
 *
 * Returns a list of videos that the current user has liked.
 *
 * @property offset Offset needed to return a specific subset of videos.
 * @property count Number of videos to return.
 * @property extended Return an additional information about videos. Also returns all owners profiles and groups.
 */
data class FaveGetVideos(
    var offset: Long? = null,
    var count: Long? = null,
    var extended: Boolean? = null
) : VkMethod<VkList<Video>>(
    "fave.getVideos",
    jacksonTypeRef()
), UserMethod
