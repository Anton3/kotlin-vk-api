@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
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
    var groupId: Int? = null,
    var albumId: Int
) : VkMethod<OkResponse, UserMethod>("video.deleteAlbum", jacksonTypeRef())
