@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.photos.objects.PhotoXtrTagInfo
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/photos.getNewTags]
 *
 * Returns a list of photos with tags that have not been viewed.
 *
 * @property offset Offset needed to return a specific subset of photos.
 * @property count Number of photos to return.
 */
data class PhotosGetNewTags(
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<PhotoXtrTagInfo>>("photos.getNewTags", jacksonTypeRef()),
    UserMethod