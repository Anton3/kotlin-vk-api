@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

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
    var offset: Long? = null,
    var count: Long? = null,
    var photoSizes: Boolean? = null
) : VkMethod<VkList<Photo>>(
    "fave.getPhotos",
    jacksonTypeRef()
), UserMethod
