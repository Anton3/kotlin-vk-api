@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
) : VkMethod<OkResponse>(
    "photos.deleteAlbum",
    jacksonTypeRef()
), UserMethod
