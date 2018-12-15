@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.video.objects.Video
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

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
    var ownerId: Long? = null,
    var videos: List<String>? = null,
    var albumId: Long? = null,
    var count: Long? = null,
    var offset: Long? = null
) : VkMethod<VkList<Video>>("video.get", jacksonTypeRef()),
    UserMethod
