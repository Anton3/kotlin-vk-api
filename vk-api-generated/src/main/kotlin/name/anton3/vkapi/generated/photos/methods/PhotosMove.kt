@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

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
    var ownerId: Int? = null,
    var targetAlbumId: Int,
    var photoId: Int
) : CheckedMethod<OkResponse, UserMethod>("photos.move", jacksonTypeRef())
