@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/fave.getPhotos]
 *
 * Returns a list of photos that the current user has liked.
 *
 * @property offset Offset needed to return a specific subset of photos.
 * @property count Number of photos to return.
 * @property photoSizes '1' — to return photo sizes in a [vk.com/dev/photo_sizes|special format].
 */
data class FaveGetPhotos(
    var offset: Int? = null,
    var count: Int? = null,
    var photoSizes: Boolean? = null
) : VkMethod<VkList<Photo>>("fave.getPhotos", jacksonTypeRef()),
    UserMethod
