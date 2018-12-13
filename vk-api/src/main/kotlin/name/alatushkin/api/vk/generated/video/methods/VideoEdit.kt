@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
    var ownerId: Long? = null,
    var videoId: Long,
    var name: String? = null,
    var desc: String? = null,
    var privacyView: List<String>? = null,
    var privacyComment: List<String>? = null,
    var noComments: Boolean? = null,
    var repeat: Boolean? = null
) : VkMethod<OkResponse>(
    "video.edit",
    jacksonTypeRef()
), UserMethod
