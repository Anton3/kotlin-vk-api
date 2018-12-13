@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.move]
 *
 * Moves a photo from one album to another.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property targetAlbumId ID of the album to which the photo will be moved.
 * @property photoId Photo ID.
 */
data class PhotosMove(
    var ownerId: Long? = null,
    var targetAlbumId: Long,
    var photoId: Long
) : VkMethod<OkResponse>(
    "photos.move",
    jacksonTypeRef()
), UserMethod
