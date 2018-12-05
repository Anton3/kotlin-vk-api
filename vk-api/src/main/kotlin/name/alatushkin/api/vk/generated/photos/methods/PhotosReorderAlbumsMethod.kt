@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
class PhotosReorderAlbumsMethod(
        ownerId: Long? = null,
        albumId: Long,
        before: Long? = null,
        after: Long? = null
) : VkMethod<Boolean>(
    "photos.reorderAlbums",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long? by props
    var albumId: Long by props
    var before: Long? by props
    var after: Long? by props

    init {
        this.ownerId = ownerId
        this.albumId = albumId
        this.before = before
        this.after = after
    }

    fun setOwnerId(ownerId: Long): PhotosReorderAlbumsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setAlbumId(albumId: Long): PhotosReorderAlbumsMethod {
        this.albumId = albumId
        return this
    }

    fun setBefore(before: Long): PhotosReorderAlbumsMethod {
        this.before = before
        return this
    }

    fun setAfter(after: Long): PhotosReorderAlbumsMethod {
        this.after = after
        return this
    }
}
