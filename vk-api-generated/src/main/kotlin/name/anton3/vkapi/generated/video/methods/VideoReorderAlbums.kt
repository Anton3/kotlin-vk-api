@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.reorderAlbums]
 *
 * Reorders the album in the list of user video albums.
 *
 * @property ownerId ID of the user or community that owns the albums..
 * @property albumId Album ID.
 * @property before ID of the album before which the album in question shall be placed.
 * @property after ID of the album after which the album in question shall be placed.
 */
data class VideoReorderAlbums(
    var ownerId: Int? = null,
    var albumId: Int,
    var before: Int? = null,
    var after: Int? = null
) : VkMethod<OkResponse>("video.reorderAlbums", jacksonTypeRef()),
    UserMethod
