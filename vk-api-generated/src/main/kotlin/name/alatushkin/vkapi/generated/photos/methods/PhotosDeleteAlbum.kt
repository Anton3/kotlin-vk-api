@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/photos.deleteAlbum]
 *
 * Deletes a photo album belonging to the current user.
 *
 * @property albumId Album ID.
 * @property groupId ID of the community that owns the album.
 */
data class PhotosDeleteAlbum(
    var albumId: Long,
    var groupId: Long? = null
) : VkMethod<OkResponse>("photos.deleteAlbum", jacksonTypeRef()),
    UserMethod
