@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.video.objects.Video
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

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
) : VkMethod<VkList<Video>>("fave.getVideos", jacksonTypeRef()),
    UserMethod