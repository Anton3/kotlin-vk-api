@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.video.objects.VideoTag
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/video.getTags]
 *
 * Returns a list of tags on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 */
data class VideoGetTags(
    var ownerId: Int? = null,
    var videoId: Int
) : CheckedMethod<List<VideoTag>, UserMethod>("video.getTags", jacksonTypeRef())
