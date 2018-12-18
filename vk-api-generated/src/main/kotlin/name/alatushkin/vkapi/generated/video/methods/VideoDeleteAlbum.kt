@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.deleteAlbum]
 *
 * Deletes a video album.
 *
 * @property groupId Community ID (if the album is owned by a community).
 * @property albumId Album ID.
 */
data class VideoDeleteAlbum(
    var groupId: Long? = null,
    var albumId: Long
) : VkMethod<OkResponse>("video.deleteAlbum", jacksonTypeRef()),
    UserMethod
