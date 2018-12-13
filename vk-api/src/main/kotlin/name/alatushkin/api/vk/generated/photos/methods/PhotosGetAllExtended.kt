@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.photos.objects.GetAllExtendedResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
data class PhotosGetAllExtended(
    var ownerId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var photoSizes: Boolean? = null,
    var noServiceAlbums: Boolean? = null,
    var needHidden: Boolean? = null,
    var skipHidden: Boolean? = null
) : VkMethod<GetAllExtendedResponse>(
    "photos.getAll",
    jacksonTypeRef()
), UserMethod {
    init {
        unsafeParam("extended", "1")
    }
}
