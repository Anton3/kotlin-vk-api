@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.photos.objects.PhotoAlbumFull
import name.alatushkin.api.vk.tokens.UserServiceMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/photos.getAlbums]
 *
 * Returns a list of a user's or community's photo albums.
 *
 * @property ownerId ID of the user or community that owns the albums.
 * @property albumIds Album IDs.
 * @property offset Offset needed to return a specific subset of albums.
 * @property count Number of albums to return.
 * @property needSystem '1' — to return system albums with negative IDs
 * @property needCovers '1' — to return an additional 'thumb_src' field, '0' — (default)
 * @property photoSizes '1' — to return photo sizes in a
 */
data class PhotosGetAlbums(
    var ownerId: Long? = null,
    var albumIds: List<Long>? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var needSystem: Boolean? = null,
    var needCovers: Boolean? = null,
    var photoSizes: Boolean? = null
) : VkMethod<VkList<PhotoAlbumFull>>(
    "photos.getAlbums",
    jacksonTypeRef()
), UserServiceMethod
