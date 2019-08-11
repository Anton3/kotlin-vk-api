@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.photos.objects.PhotoAlbumFull
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.vktypes.VkList

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
    var ownerId: Int? = null,
    var albumIds: List<Int>? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var needSystem: Boolean? = null,
    var needCovers: Boolean? = null,
    var photoSizes: Boolean? = null
) : CheckedMethod<VkList<PhotoAlbumFull>, UserServiceMethod>("photos.getAlbums", jacksonTypeRef())
