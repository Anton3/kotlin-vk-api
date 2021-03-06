@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/photos.getById]
 *
 * Returns information about photos by their IDs.
 *
 * @property photos IDs separated with a comma, that are IDs of users who posted photos and IDs of photos themselves with an underscore character between such IDs. To get information about a photo in the group album, you shall specify group ID instead of user ID. Example: "1_129207899,6492_135055734, , -20629724_271945303"
 * @property photoSizes '1' — to return photo sizes in a
 */
data class PhotosGetById(
    var photos: List<String>,
    var photoSizes: Boolean? = null
) : VkMethod<List<Photo>, UserServiceMethod>("photos.getById", jacksonTypeRef())
