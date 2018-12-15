@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.tokens.UserServiceMethod
import name.alatushkin.vkapi.vktypes.VkList

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
    var startTime: Long? = null,
    var endTime: Long? = null,
    var sort: Long? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var radius: Long? = null
) : VkMethod<VkList<Photo>>("photos.search", jacksonTypeRef()),
    UserServiceMethod
