@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.video.objects.SaveResult
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/video.save]
 *
 * Returns a server address (required for upload) and video data.
 *
 * @property name Name of the video.
 * @property description Description of the video.
 * @property isPrivate '1' — to designate the video as private (send it via a private message), the video will not appear on the user's video list and will not be available by ID for other users, '0' — not to designate the video as private
 * @property wallpost '1' — to post the saved video on a user's wall, '0' — not to post the saved video on a user's wall
 * @property link URL for embedding the video from an external website.
 * @property groupId ID of the community in which the video will be saved. By default, the current user's page.
 * @property albumId ID of the album to which the saved video will be added.
 * @property privacyView No description
 * @property privacyComment No description
 * @property noComments No description
 * @property repeat '1' — to repeat the playback of the video, '0' — to play the video once,
 */
data class VideoSave(
    var name: String? = null,
    var description: String? = null,
    var isPrivate: Boolean? = null,
    var wallpost: Boolean? = null,
    var link: String? = null,
    var groupId: Int? = null,
    var albumId: Int? = null,
    var privacyView: List<String>? = null,
    var privacyComment: List<String>? = null,
    var noComments: Boolean? = null,
    var repeat: Boolean? = null
) : VkMethod<SaveResult, UserMethod>("video.save", jacksonTypeRef())
