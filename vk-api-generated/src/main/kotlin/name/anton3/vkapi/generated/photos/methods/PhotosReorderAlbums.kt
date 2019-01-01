@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/photos.reorderAlbums]
 *
 * Reorders the album in the list of user albums.
 *
 * @property ownerId ID of the user or community that owns the album.
 * @property albumId Album ID.
 * @property before ID of the album before which the album in question shall be placed.
 * @property after ID of the album after which the album in question shall be placed.
 */
data class PhotosReorderAlbums(
    var ownerId: Int? = null,
    var albumId: Int,
    var before: Int? = null,
    var after: Int? = null
) : VkMethod<OkResponse>("photos.reorderAlbums", jacksonTypeRef()),
    UserMethod
