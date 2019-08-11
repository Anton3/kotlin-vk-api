@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.photos.objects.GetAllResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/photos.getAll]
 *
 * Returns a list of photos belonging to a user or community, in reverse chronological order.
 *
 * @property ownerId ID of a user or community that owns the photos. Use a negative value to designate a community ID.
 * @property offset Offset needed to return a specific subset of photos. By default, '0'.
 * @property count Number of photos to return.
 * @property photoSizes '1' – to return image sizes in [vk.com/dev/photo_sizes|special format].
 * @property noServiceAlbums '1' – to return photos only from standard albums, '0' – to return all photos including those in service albums, e.g., 'My wall photos' (default)
 * @property needHidden '1' – to show information about photos being hidden from the block above the wall.
 * @property skipHidden '1' – not to return photos being hidden from the block above the wall. Works only with owner_id>0, no_service_albums is ignored.
 */
data class PhotosGetAll(
    var ownerId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var photoSizes: Boolean? = null,
    var noServiceAlbums: Boolean? = null,
    var needHidden: Boolean? = null,
    var skipHidden: Boolean? = null
) : CheckedMethod<GetAllResponse, UserMethod>("photos.getAll", jacksonTypeRef())
