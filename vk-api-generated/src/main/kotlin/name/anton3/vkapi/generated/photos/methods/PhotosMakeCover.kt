@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/photos.makeCover]
 *
 * Makes a photo into an album cover.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property albumId Album ID.
 */
data class PhotosMakeCover(
    var ownerId: Int? = null,
    var photoId: Int,
    var albumId: Int? = null
) : VkMethod<OkResponse>("photos.makeCover", jacksonTypeRef()),
    UserMethod
