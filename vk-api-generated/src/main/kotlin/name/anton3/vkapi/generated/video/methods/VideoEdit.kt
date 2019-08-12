@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.edit]
 *
 * Edits information about a video on a user or community page.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 * @property name New video title.
 * @property desc New video description.
 * @property privacyView Privacy settings in a [vk.com/dev/privacy_setting|special format]. Privacy setting is available for videos uploaded to own profile by user.
 * @property privacyComment Privacy settings for comments in a [vk.com/dev/privacy_setting|special format].
 * @property noComments Disable comments for the group video.
 * @property repeat '1' — to repeat the playback of the video, '0' — to play the video once,
 */
data class VideoEdit(
    var ownerId: Int? = null,
    var videoId: Int,
    var name: String? = null,
    var desc: String? = null,
    var privacyView: List<String>? = null,
    var privacyComment: List<String>? = null,
    var noComments: Boolean? = null,
    var repeat: Boolean? = null
) : VkMethod<OkResponse, UserMethod>("video.edit", jacksonTypeRef())
