@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

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
    var ownerId: Long? = null,
    var albumId: Long,
    var before: Long? = null,
    var after: Long? = null
) : VkMethod<OkResponse>(
    "photos.reorderAlbums",
    jacksonTypeRef()
), UserMethod
