@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
    var ownerId: Long? = null,
    var photoId: Long,
    var albumId: Long? = null
) : VkMethod<OkResponse>(
    "photos.makeCover",
    jacksonTypeRef()
), UserMethod
