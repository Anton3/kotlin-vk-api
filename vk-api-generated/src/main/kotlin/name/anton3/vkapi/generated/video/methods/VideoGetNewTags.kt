@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.video.objects.VideoTagInfo
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/video.getNewTags]
 *
 * Returns a list of videos with tags that have not been viewed.
 *
 * @property offset Offset needed to return a specific subset of videos.
 * @property count Number of videos to return.
 */
data class VideoGetNewTags(
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<VkList<VideoTagInfo>, UserMethod>("video.getNewTags", jacksonTypeRef())
