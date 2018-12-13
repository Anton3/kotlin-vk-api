@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.editAlbum]
 *
 * Edits information about a photo album.
 *
 * @property albumId ID of the photo album to be edited.
 * @property title New album title.
 * @property description New album description.
 * @property ownerId ID of the user or community that owns the album.
 * @property privacyView 
 * @property privacyComment 
 * @property uploadByAdminsOnly 
 * @property commentsDisabled 
 */
data class PhotosEditAlbum(
    var albumId: Long,
    var title: String? = null,
    var description: String? = null,
    var ownerId: Long? = null,
    var privacyView: List<String>? = null,
    var privacyComment: List<String>? = null,
    var uploadByAdminsOnly: Boolean? = null,
    var commentsDisabled: Boolean? = null
) : VkMethod<OkResponse>(
    "photos.editAlbum",
    jacksonTypeRef()
), UserMethod
