@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.photos.objects.GetAlbumId
import name.alatushkin.api.vk.generated.photos.objects.PhotoFull
import name.alatushkin.api.vk.tokens.UserServiceMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/photos.get]
 *
 * Returns a list of a user's or community's photos.
 *
 * @property ownerId ID of the user or community that owns the photos. Use a negative value to designate a community ID.
 * @property albumId Photo album ID. To return information about photos from service albums, use the following string values: 'profile, wall, saved'.
 * @property photoIds Photo IDs.
 * @property rev Sort order: '1' — reverse chronological, '0' — chronological
 * @property feedType Type of feed obtained in 'feed' field of the method.
 * @property feed unixtime, that can be obtained with [vk.com/dev/newsfeed.get|newsfeed.get] method in date field to get all photos uploaded by the user on a specific day, or photos the user has been tagged on. Also, 'uid' parameter of the user the event happened with shall be specified.
 * @property photoSizes '1' — to return photo sizes in a [vk.com/dev/photo_sizes|special format]
 * @property offset 
 * @property count 
 */
data class PhotosGetExtended(
    var ownerId: Long? = null,
    var albumId: GetAlbumId? = null,
    var photoIds: List<String>? = null,
    var rev: Boolean? = null,
    var feedType: String? = null,
    var feed: Long? = null,
    var photoSizes: Boolean? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<PhotoFull>>(
    "photos.get",
    jacksonTypeRef()
), UserServiceMethod {
    init {
        unsafeParam("extended", "1")
    }
}
