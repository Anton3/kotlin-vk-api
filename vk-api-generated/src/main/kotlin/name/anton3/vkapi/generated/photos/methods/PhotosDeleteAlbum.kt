@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/photos.deleteAlbum]
 *
 * Deletes a photo album belonging to the current user.
 *
 * @property albumId Album ID.
 * @property groupId ID of the community that owns the album.
 */
data class PhotosDeleteAlbum(
    var albumId: Int,
    var groupId: Int? = null
) : VkMethod<OkResponse>("photos.deleteAlbum", jacksonTypeRef()),
    UserMethod
