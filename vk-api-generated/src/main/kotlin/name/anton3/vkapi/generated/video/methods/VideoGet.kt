@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.video.objects.Video
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/video.get]
 *
 * Returns detailed information about videos.
 *
 * @property ownerId ID of the user or community that owns the video(s).
 * @property videos Video IDs, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", Use a negative value to designate a community ID. Example: "-4363_136089719,13245770_137352259"
 * @property albumId ID of the album containing the video(s).
 * @property count Number of videos to return.
 * @property offset Offset needed to return a specific subset of videos.
 */
data class VideoGet(
    var ownerId: Int? = null,
    var videos: List<String>? = null,
    var albumId: Int? = null,
    var count: Int? = null,
    var offset: Int? = null
) : VkMethod<VkList<Video>>("video.get", jacksonTypeRef()),
    UserMethod
