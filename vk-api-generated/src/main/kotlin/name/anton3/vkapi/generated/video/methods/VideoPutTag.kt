@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/video.putTag]
 *
 * Adds a tag on a video.
 *
 * @property userId ID of the user to be tagged.
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 * @property taggedName Tag text.
 */
data class VideoPutTag(
    var userId: Int,
    var ownerId: Int? = null,
    var videoId: Int,
    var taggedName: String? = null
) : CheckedMethod<Int, UserMethod>("video.putTag", jacksonTypeRef())
