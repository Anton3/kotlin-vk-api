@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.video.objects.VideoTag
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/video.getTags]
 *
 * Returns a list of tags on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 */
data class VideoGetTags(
    var ownerId: Long? = null,
    var videoId: Long
) : VkMethod<List<VideoTag>>("video.getTags", jacksonTypeRef()),
    UserMethod
