@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.photos.objects.PhotoAlbumFull
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.createAlbum]
 *
 * Creates an empty photo album.
 *
 * @property title Album title.
 * @property groupId ID of the community in which the album will be created.
 * @property description Album description.
 * @property privacyView 
 * @property privacyComment 
 * @property uploadByAdminsOnly 
 * @property commentsDisabled 
 */
data class PhotosCreateAlbum(
    var title: String,
    var groupId: Long? = null,
    var description: String? = null,
    var privacyView: List<String>? = null,
    var privacyComment: List<String>? = null,
    var uploadByAdminsOnly: Boolean? = null,
    var commentsDisabled: Boolean? = null
) : VkMethod<PhotoAlbumFull>(
    "photos.createAlbum",
    jacksonTypeRef()
), UserMethod
