@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.tokens.UserServiceMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/photos.search]
 *
 * Returns a list of photos.
 *
 * @property q Search query string.
 * @property lat Geographical latitude, in degrees (from '-90' to '90').
 * @property long Geographical longitude, in degrees (from '-180' to '180').
 * @property startTime 
 * @property endTime 
 * @property sort Sort order:
 * @property offset Offset needed to return a specific subset of photos.
 * @property count Number of photos to return.
 * @property radius Radius of search in meters (works very approximately). Available values: '10', '100', '800', '6000', '50000'.
 */
data class PhotosSearch(
    var q: String? = null,
    var lat: Double? = null,
    var long: Double? = null,
    var startTime: Int? = null,
    var endTime: Int? = null,
    var sort: Int? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var radius: Int? = null
) : VkMethod<VkList<Photo>>("photos.search", jacksonTypeRef()),
    UserServiceMethod
